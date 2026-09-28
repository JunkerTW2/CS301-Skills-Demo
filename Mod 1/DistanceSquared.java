public class DistanceSquared {
    void main(String[] args) {
        if (args.length == 2) {
            try{
                int x = Integer.parseInt(args[0]);
                int y = Integer.parseInt(args[1]);
                double pythag = Math.sqrt((x * x) + (y * y));
                double squaredDistance = pythag * pythag;
                IO.println("The point (" + x + ", " + y + ") is " + pythag + " units from (0, 0).");
            IO.println("Squared distance: " + squaredDistance);
            } catch (NumberFormatException e) {
                System.err.println("Must be an integer.");
            }
        } else {
            IO.println("Supply two arguments.");
        }
    }
}
