import java.util.*;

public class SumOfDigits {
    public static void findSum(int n) {
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum += ld;
            n /= 10;
        }
        System.out.println("Sum of the digits is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        findSum(n);
    }
}
