import java.util.*;

public class SubArray {
    public static void subArray(int arr[]) {
        int ts = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            // int start = i;
            for (int j = i; j <= arr.length - 1; j++) {
                // int end = j;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");// subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays is: " + ts);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subArray(arr);
    }
}
