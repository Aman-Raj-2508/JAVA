public class merge_Sort {

    // mergeing two sorted arrays

    public static int[] mergetwosortedArrays(int A[], int B[]) {
        int n = A.length;
        int m = B.length;
        int i = 0, j = 0, k = 0;
        int result[] = new int[n + m];

        while (i < n && j < m) {
            if (A[i] < B[j]) {
                result[k] = A[i];
                k++;
                i++;
            } else {
                result[k] = B[j];
                k++;
                j++;
            }
        }
        while (i < n) {
            result[k++] = A[i++];
        }

        while (j < m) {
            result[k++] = B[j++];
        }

        return result;
    }

    // merge function
    public static void merge(int arr[], int start, int mid, int end) {
        int left[] = new int[mid - start + 1];
        int right[] = new int[end - mid];
        int k = 0;
        for (int i = start; i <= mid; i++) {
            left[k++] = arr[i];
        }
        k = 0;
        for (int i = mid + 1; i <= end; i++) {
            right[k++] = arr[i];
        }

        int result[] = mergetwosortedArrays(left, right);

        k = 0;
        for (int i = start; i <= end; i++) {
            arr[i] = result[k++];
        }
    }

    // Helper funciton
    public static void f(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        f(arr, start, mid);
        f(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void mergesort(int arr[]) {
        f(arr, 0, arr.length - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 11, 2, -3, 6, 8, 0, 2 };
        mergesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

/*
 * f(arr,start,end)=> f(arr,start,mid) , f(arr.mid+1,end) =>
 * merge(arr,start,mid,end)
 */