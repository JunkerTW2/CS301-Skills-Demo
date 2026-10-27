
/**
 * Given an array of N elements, not necessarily in ascending order, devise an
 * algorithm to find the kth largest one. It should run in O(N) time on random
 * inputs
 */
import java.util.*;

public class FindKthLargest {

    void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int range = Integer.parseInt(args[2]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniformInt(range);
        }
        IO.println(Arrays.toString(a));
        int kthLargest = findKthLargest(a, k);
        IO.println(Arrays.toString(temp));
        IO.println("The kth largest element is: " + kthLargest);
    }

    private static int[] temp;

    public static int findKthLargest(int[] a, int k) {
        temp = new int[a.length];
        sort(a, 0, a.length);
        int kthLargest = a[a.length - k];
        return kthLargest;
    }

    public static void sort(int[] a, int lo, int hi) {
        if (hi - lo <= 1) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid;
        for (int k = lo; k < hi; k++) {
            if (i == mid) {
                temp[k] = a[j];
                j++;
            } else if (j == hi) {
                temp[k] = a[i];
                i++;
            } else if (a[i] > a[j]) {
                temp[k] = a[j];
                j++;
            } else {
                temp[k] = a[i];
                i++;
            }
        }
        for (int k = lo; k < hi; k++) {
            a[k] = temp[k];
        }
    }
}
