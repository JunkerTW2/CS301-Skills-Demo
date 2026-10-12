public class RecursiveBinarySearch {

    void main() {
        int[] numbers = new int[] { 3, 8, 12, 17, 21, 35, 48 };
        IO.println(search(numbers, 17)); // true
        IO.println(search(numbers, 20)); // false
    }

    public static boolean search(int[] numbers, int target) {
        return search(numbers, target, 0, numbers.length - 1);
    }

    public static boolean search(int[] numbers, int target, int low, int high) {
        int mid = low + (high - low) / 2;
        if (low > high) {
            return false;
        }
        if (target == numbers[mid]) {
            return true;
        }
        if (target > numbers[mid]) {
            return search(numbers, target, mid + 1, high);
        }
        if (target < numbers[mid]) {
            return search(numbers, target, low, mid - 1);
        }
        return false;
    }
}
