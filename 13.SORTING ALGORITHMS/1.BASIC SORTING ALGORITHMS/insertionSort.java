public class insertionSort {

    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr_Element = arr[i];
            int j = i - 1;

            // Shift elements to the right to make space for curr_Element
            while (j >= 0 && arr[j] > curr_Element) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place curr_Element at the correct position
            arr[j + 1] = curr_Element;
        }

        // Print sorted array
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 9, 3, 6, 18, 2 };
        insertionsort(arr);
    }
}
