import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0; // Initialize n3
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2; // Update n1 to n2
            n2 = n3; // Update n2 to n3
        }
    }
}
