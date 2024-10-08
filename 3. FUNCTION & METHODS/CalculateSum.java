import java.util.*;

public class CalculateSum {
    public static int Calculate_Sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Calculate_Sum(a, b);
        System.out.println("Sum is: " + sum);
    }
}
