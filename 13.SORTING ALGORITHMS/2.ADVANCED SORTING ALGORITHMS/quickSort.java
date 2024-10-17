public class quickSort {

    // Swapping
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // return type is int because we want pivot element index.Also pi means pivot
    // index
    public static int partition(int arr[], int l, int r, int pi) {
        int pivot = arr[pi];
        swap(arr, pi, r);
        int m = l;
        for (int i = l; i <= r - 1; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, m);
                m++;
            }
        }
        swap(arr, m, r);
        return m;
    }

    // for random pivot
    public static int getrandom(int l, int r) {
        return (int) (Math.random() * (r - l) + l);
    }

    // helper function
    public static void f(int arr[], int l, int r) {
        if (l > r)
            return;
        int pi = getrandom(l, r);
        int x = partition(arr, l, r, pi);
        f(arr, l, x - 1);// left
        f(arr, x + 1, r);// right
    }

    // quick sort funciton
    public static void quicksort(int arr[]) {
        f(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 11, 2, -3, 6, 8, 0, 2 };
        quicksort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
