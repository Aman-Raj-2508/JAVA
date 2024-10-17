public class selectionSort {
    public static int getMinimumIndex(int arr[], int start) {
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = getMinimumIndex(arr, i);
            if (i != minIndex) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 15, 1, 6, 3, -1, 2, 10 };
        selectionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
