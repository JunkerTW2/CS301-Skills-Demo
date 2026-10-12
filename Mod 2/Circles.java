public class Circles {

    void main(String[] args) {
        IO.println(args.length);
        if (args.length == 4) {
            try {
                int quantity = Integer.parseInt(args[0]);
                double probability = Double.parseDouble(args[1]);
                double minRadius = Double.parseDouble(args[2]);
                double maxRadius = Double.parseDouble(args[2]);
                for (int i = 0; i < quantity; i++) {
                    if (Math.random() >= probability) {
                        StdDraw.setPenColor(StdDraw.BLACK);
                    } else {
                        StdDraw.setPenColor(StdDraw.WHITE);
                    }
                    double x = Math.random();
                    double y = Math.random();
                    double radius = minRadius + Math.random() * (maxRadius - minRadius);
                    StdDraw.filledCircle(x, y, radius);
                }
            } catch (NumberFormatException e) {
                System.err.println("Must be an integer.");
            }
        } else {
            IO.println("Supply four arguments.");
        }
    }
}