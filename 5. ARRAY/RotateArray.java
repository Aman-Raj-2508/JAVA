import java.util.*;

public class RotateArray {
    public static void rotate(int arr[], int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        for (int rotation = 1; rotation <= k; rotation++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 3;
        rotate(arr, k);
    }
}