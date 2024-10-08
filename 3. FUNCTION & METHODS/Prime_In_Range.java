import java.util.*;

public class Prime_In_Range {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= (n - 1); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primesInRange(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // by default always return a true value
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println(primesInRange(n));
    }

}
