import java.util.*;

public class EvenMethod {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (isEven(n)) {
            System.out.println("Even number: ");
        } else {
            System.out.println("Odd number: ");
        }
    }
}
