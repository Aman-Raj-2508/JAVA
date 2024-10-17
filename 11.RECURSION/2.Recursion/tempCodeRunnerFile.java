public class printMaxElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 8, 19, 21, -1, -2 };
        System.out.println(maxElement(arr, 0));
    }

    public static int maxElement(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        return Math.max(arr[idx], maxElement(arr, idx + 1));
    }
}