import java.util.*;

public class MaxSubarraySumBrute {
    public static void maxSum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        // startng index of subarray
        for (int i = 0; i <= arr.length - 1; i++) {
            // ending index of subarray
            for (int j = i; j <= arr.length - 1; j++) {
                int currsum = 0;
                // to find the subarray and its sum
                for (int k = i; k <= j; k++) {
                    currsum += arr[k];
                }
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum is: " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSum(arr);
    }
}
