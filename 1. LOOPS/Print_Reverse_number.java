import java.util.*;

public class Print_Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nov you want to reverse: ");
        int n = sc.nextInt();
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
    }
}
// Using for loop
// class Main {
// public static void main(String[] args) {
// int num = 1234567, reversed = 0;
// for(;num != 0; num /= 10) {
// int digit = num % 10;
// reversed = reversed * 10 + digit;
// }
// System.out.println("Reversed Number: " + reversed);
// }
// }