import java.util.*;

public class Prime {

    public static boolean printPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean result = printPrime(n);
        if (result == true) {
            System.out.println("Prime number ");
        } else {
            System.out.println("Not a Prime number ");
        }
        // System.out.println(printPrime(11));
    }
}