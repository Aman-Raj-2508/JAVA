import java.util.*;

public class palindrome {
    public static void findpalindrome(int n) {
        int originalnumber = n;
        int reverse = 0;
        while (n > 0) {
            int ld = n % 10;
            reverse = (reverse * 10) + ld;
            n /= 10;
        }
        if (originalnumber == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        findpalindrome(n);
    }
}
