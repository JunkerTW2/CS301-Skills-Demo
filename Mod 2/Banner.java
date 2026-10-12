public class Banner {

    void main(String args[]) {
        String str = args[0];
        double speed = Double.parseDouble(args[1]);
        /*
         * Clear off the screen.
         * Draw objects on the offscreen canvas.
         * Copy the offscreen canvas to the onscreen canvas.
         * Wait for a short while.
         */
        StdDraw.enableDoubleBuffering();
        double x = -0.5;
        double y = 0.5;
        while (true) {
            StdDraw.clear();
            StdDraw.text(x, y, str);
            StdDraw.show();
            StdDraw.pause(15);
            x += speed;
            if (x > 1.0) {
                x = -0.5;
            }
        }
    }
}
