public class firstOccurrence {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 3, 9, 0 };
        int x = 14;
        System.out.println(firstOccurrences(arr, 0, x));
    }

    public static int firstOccurrences(int arr[], int idx, int x) {
        if (idx >= arr.length) {
            return -1;
        }
        return (arr[idx] == x) ? idx : firstOccurrences(arr, idx + 1, x);
    }
}
