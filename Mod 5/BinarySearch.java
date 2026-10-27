
/**
 * Given an array a[] of N distinct integers (positive or negative) in ascending
 * order:
 * Devise an algorithm to find an index i such that a[i] = i if such an index
 * exists.
 */
public class BinarySearch {

    void main() {
        int[] a = { -5, -4, 0, 2, 4, 8, 9, -5, -4, 0, 2, 4, 8, 9, -5, -4, 0, 2, 4, 8, 9, 0, -5, -4, 0, 2, 4, 8, 9, -5,
                -4, 0, 2, 4, 8, 9, -5, -4, 0, 2, 4, 8, 9, 43 };
        int search = search(a);
        if (search == -1) {
            IO.println("There is no index i such that a[i] = i.");
        } else {
            IO.println("Index: " + search);
        }
    }

    public static int search(int[] a) {
        return search(a, 0, a.length);
    }

    public static int search(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (a[mid] == mid) {
            return mid;
        } else if (a[mid] < mid) {
            lo = mid + 1;
        } else if (a[mid] > mid) {
            hi = mid - 1;
        }
        return search(a, lo, hi);
    }
}
