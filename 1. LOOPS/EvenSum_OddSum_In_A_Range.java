import java.util.*;

public class EvenSum_OddSum_In_A_Range {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i <= n; i++) {// Finds sum in a range
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);
    }
}
