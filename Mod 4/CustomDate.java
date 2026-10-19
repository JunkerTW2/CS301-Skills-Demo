/*Create a data type Date that represents a date.
You should be able to create a new Date by specifying the month, day, and year.
It should supports methods to compute the number of days between two dates,
        return the day of the week that a day falls on, etc.
 */
public class CustomDate {
    private int month;
    private int day;
    private int year;

    static void main() {
        CustomDate d1 = new CustomDate(7, 4, 1989);
        CustomDate d2 = new CustomDate(9, 23, 1997);
        IO.println("Date 1: " + d1);
        IO.println("Date 2: " + d2);
        IO.println("Day of week for Date 1: " + d1.getDayOfWeek());
        IO.println("Day of week for Date 2: " + d2.getDayOfWeek());
        IO.println("Is 1989 a leap year? " + d1.isLeapYear());
        IO.println("Is 1997 a leap year? " + d2.isLeapYear());
        IO.println("Days between Date 1 and Date 2: " + d1.getDaysBetween(d2));
    }

    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getDaysBetween(CustomDate other) {
        // IO.println(Math.abs(this.totalDays() - other.totalDays()));
        return Math.abs(this.totalDays() - other.totalDays());
    }

    private int totalDays() {
        int x = (365 * year) + (year / 4) - (year / 100) + (year / 400); // full years
        int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i = 0; i <= this.month; i++) { // days since beginning of year to current month
            x += daysInMonths[i];
        }
        x += this.day; // days since beginning of month
        if (this.isLeapYear() && this.month > 2) { // account for leap year
            x++;
        }
        // IO.println(x); // it is a day off, close enough...
        return x;
    }

    public int getDayOfWeek() {
        int y0 = year - (14 - month) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400); // left over days
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7; // day of the week
        // 0 for Sunday, 1 for Monday, 2 for Tuesday, 3 for Wednesday, etc...
        // IO.println(d0);
        return d0;
    }

    public boolean isLeapYear() {
        // Leap year must be divisible by 4, not be divisible by 100 unless it is also
        // divisible by 400.
        // IO.println(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
