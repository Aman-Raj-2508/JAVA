import java.util.*;

public class PlusOne_66 {
    public static ArrayList<Integer> plusOne(int[] digits) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = digits.length;
        int sum = digits[n - 1] + 1;
        int val = sum % 10;
        int carry = sum / 10;
        result.add(0, val);
        for (int i = n - 2; i >= 0; i--) {
            if (digits[i] == 9) {
                sum = digits[i] + carry;
                val = sum % 10;
                carry = sum / 10;
                result.add(0, val);
            } else {
                sum = digits[i] + carry;
                val = sum % 10;
                carry = sum / 10;
                result.add(0, val);
            }
        }
        if (carry > 0) {
            result.add(0, carry);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 9 };
        System.out.println(plusOne(arr));

    }
}
// import java.util.*;
// public class PlusOne_66{
// public static int [] plusOne(int digits[]){
// int n =digits.length;
// for(int i=n-1;i>=0;i--){
// if(digits[i]<9){
// digits[i]++;
// return digits;
// }
// digits[i]=0;
// }
// int digits[]=new int[n+1];
// digits[0]=1;
// return digits;
// }
// }