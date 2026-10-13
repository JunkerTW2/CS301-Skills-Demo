public class Partition {

    void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        partition(n);
    }

    public static void partition(int n) {
        partition(n, n, "");
    }

    public static void partition(int index, int n, String str) {
        if (n == 0) {
            IO.println(str);
            return;
        }
        for (int i = Math.min(n, index); i > 0; i--) {
            partition(i, n - i, str + " " + i);
        }
    }
}
