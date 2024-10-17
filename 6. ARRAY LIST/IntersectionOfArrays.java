import java.util.*;

public class IntersectionOfArrays {
    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr1[] = { 10, 19, 20, 30, 30, 40, 40, 40, 50 };
        int arr2[] = { 15, 16, 17, 18, 20, 25, 30, 30, 40 };
        ArrayList<Integer> ans = new ArrayList<>();
        ans = intersection(arr1, arr2);
        System.out.println(ans);
    }
}
