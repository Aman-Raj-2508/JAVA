public class printArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6, 7, 8 };
        printArrays(arr, 0);
    }

    public static void printArrays(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        printArrays(arr, idx + 1);
    }
}
