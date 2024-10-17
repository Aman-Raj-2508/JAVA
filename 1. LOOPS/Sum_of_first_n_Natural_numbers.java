import java.util.*;

public class Sum_of_first_n_Natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want to find sum:");
        int n = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while (counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum of first " + n + " natural numberes is: " + sum);
    }
}
