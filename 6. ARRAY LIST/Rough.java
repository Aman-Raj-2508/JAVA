import java.util.*;

public class Rough {
    public static void intersection(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 10, 19, 20, 30, 40, 40, 40, 50 };
        int arr2[] = { 15, 16, 17, 18, 20, 25, 30, 30, 40 };
        intersection(arr1, arr2);
    }
}
