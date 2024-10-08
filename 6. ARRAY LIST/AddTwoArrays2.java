import java.util.*;

public class AddTwoArrays2 {
    public static ArrayList<Integer> SumOfTwoArrays(int arr1[], int arr2[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = 0;
            sum = arr1[i] + arr2[j];
            sum += carry;
            int rem = sum % 10;
            carry = sum / 10;
            result.add(0, rem);
            i--;
            j--;
        }
        if (carry >= 1) {
            result.add(0, carry);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 4 };
        int arr2[] = { 9, 1, 6 };
        System.out.println(SumOfTwoArrays(arr1, arr2));
    }
}