public class TwentyFivePerLine {
    void main() {
        int count = 0;
        for (int i = 1000; i <= 2000; i++) {
            IO.print(i + " ");
            count++;
            if (count == 25) {
                IO.println();
                count = 0;
            }
        }
    }
}