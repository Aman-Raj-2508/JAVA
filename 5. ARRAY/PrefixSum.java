public class PrefixSum {
    public static void prefixSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];

        // calculating prefix array
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }
        // for subarray
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int currsum = 0;
                currsum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println("MaxSum is: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefixSum(arr);
    }
}
