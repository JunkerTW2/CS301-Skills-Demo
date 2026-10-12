public class areTriangular {

    void main(String args[]) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        areTriangular(a, b, c);
    }

    public static boolean areTriangular(double a, double b, double c) {
        if (a + b > c && b + c > a && c + a > b) {
            return true;
        }
        return false;
    }
}
