import java.util.*;

public class BinomialCoefficient { // helper function
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int BinoCoeff(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n - r);

        int binomial = n_fact / (r_fact * nmr_fact);
        return binomial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        // BinoCoeff(n, r);
        int binomial = BinoCoeff(n, r);
        System.out.println("Binomial coefficient is: " + binomial);
    }
}
