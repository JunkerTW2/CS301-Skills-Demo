
// Had fun, went overboard.
import java.util.*;

public class SodaMachine {
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;
    private double total;

    static void main() {
        SodaMachine mine = new SodaMachine(0, 0, 0, 0, 0);
        mine.insertCoin(7, 9, 3, 5);
        boolean buying = true;
        Scanner console = new Scanner(System.in);
        while (buying) {
            IO.println("Please select from one of the following:");
            IO.println("[1] Item 1 - $1.00");
            IO.println("[2] Item 2 - $1.50");
            IO.println("[3] Item 3 - $2.00");
            IO.println("[4] Return Change");
            int selection = console.nextInt();
            if (selection == 4) {
                mine.buy(selection);
                IO.println("Returned change: " + Arrays.toString(mine.getChange()));
                buying = false;
            } else {
                mine.buy(selection);
            }
        }
    }

    public SodaMachine(int p, int n, int d, int q, int total) {
        this.pennies = p;
        this.nickels = n;
        this.dimes = d;
        this.quarters = q;
        this.total = total;
    }

    public double total() {
        total = (1.0 * pennies) + (5.0 * nickels) + (10.0 * dimes) + (25.0 * quarters);
        return total;
    }

    public double insertCoin(int p, int n, int d, int q) {
        pennies += p;
        nickels += n;
        dimes += d;
        quarters += q;
        total = total();
        IO.println("Total deposited: $" + total / 100);
        return total;
    }

    public void buy(int selection) {
        if (selection == 1) {
            if (total >= 100) {
                IO.println("Dispensing item 1...");
                total -= 100;
                IO.println("You have $" + total / 100.0 + " remaining.");
            } else {
                IO.println("Insert more coins.");
            }
        } else if (selection == 2) {
            if (total >= 150) {
                IO.println("Dispensing item 2...");
                total -= 150;
                IO.println("You have $" + total / 100.0 + " remaining.");
            } else {
                IO.println("Insert more coins.");
            }
        } else if (selection == 3) {
            if (total >= 200) {
                IO.println("Dispensing item 3...");
                total -= 200;
                IO.println("You have $" + total / 100.0 + " remaining.");
            } else {
                IO.println("Insert more coins.");
            }
        } else if (selection == 4) {
            IO.println("Returning total of $" + total / 100.0 + ".");
        } else {
            IO.println("Invalid selection.");
        }
    }

    public int[] getChange() {
        int[] change = new int[4];
        int[] coinValues = { 25, 10, 5, 1 };
        int remainingCents = (int) total;
        for (int i = 0; i < coinValues.length; i++) {
            change[i] = remainingCents / coinValues[i];
            remainingCents %= coinValues[i];
        }
        total = 0;
        return change;
    }
}
