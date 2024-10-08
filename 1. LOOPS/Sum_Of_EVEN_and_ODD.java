import java.util.*;

public class Sum_Of_EVEN_and_ODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;
        int choice;
        do {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                evensum += n;
            } else {
                oddsum += n;
            }
            System.out.println("Do you want to enter more number ? Press 1 for 'YES' Or 0 fo 'No' :");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("EvenSum is:" + evensum);
        System.out.println("OddSum is: " + oddsum);
    }
}
