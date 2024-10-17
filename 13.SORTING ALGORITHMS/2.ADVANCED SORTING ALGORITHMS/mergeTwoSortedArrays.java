public class mergeTwoSortedArrays {
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

    public static void main(String[] args) {
        int A[] = { 1, 5, 7, 10 };
        int B[] = { 2, 3, 9, 12, 16 };
        int result[] = mergetwosortedArrays(A, B);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}