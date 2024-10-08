import java.util.*;

public class ArrayCases {
    // CASE-1 Function
    public static void swap(int one, int two) {
        int temp = one;
        one = two;
        two = temp;
    }

    // CASE-2 Function
    public static void swap(int arr[], int i, int j) {
        System.out.println(arr[i] + " , " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // CASE-3 Function
    public static void Swap(int one[], int two[]) {
        int temp[] = one;
        one = two;
        two = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };

        int i = 0;// 10
        int j = 2;// 30
        // CASE----------------1
        System.out.println("CAse-----1");

        System.out.println(arr[i] + " , " + arr[j]);
        swap(arr[i], arr[j]);
        System.out.println(arr[i] + " , " + arr[j]);

        // CASE----------------2
        System.out.println("CAse-----2");

        System.out.println(arr[i] + " , " + arr[j]);
        swap(arr, i, j);
        System.out.println(arr[i] + " , " + arr[j]);

        // CASE-----------------3
        System.out.println("CAse-----3");

        int other[] = { 100, 200, 300 };
        System.out.println(arr[0] + " , " + other[0]);
        Swap(arr, other);
        System.out.println(arr[0] + " , " + other[0]);
    }
}