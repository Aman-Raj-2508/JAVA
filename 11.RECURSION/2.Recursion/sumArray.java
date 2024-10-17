public class sumArray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 0, 5 };

        System.out.println(sumArrays(arr, 0));
    }

    public static int sumArrays(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        return arr[idx] + sumArrays(arr, idx + 1);
    }
}
