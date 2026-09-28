public class Ordered {
    void main(String[] args) {
        if (args.length == 3) {
            try {
                int x = Integer.parseInt(args[0]);
                int y = Integer.parseInt(args[1]);
                int z = Integer.parseInt(args[2]);
                boolean b = (x > y && y > z) || (z > y && y > x);
                IO.println(b);
            } catch (NumberFormatException e) {
                System.err.println("Must be an integer.");
            }
        } else {
            IO.println("Supply two arguments.");
        }
    }
}
