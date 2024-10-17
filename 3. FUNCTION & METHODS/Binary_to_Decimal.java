import java.util.*;

public class Binary_to_Decimal {

    public static int bintoDec(int binarynumber) {
        int decimalnumber = 0;
        int pow = 0;

        while (binarynumber > 0) {
            int lastdigit = binarynumber % 10;
            decimalnumber = decimalnumber + (lastdigit * (int) Math.pow(2, pow));
            binarynumber /= 10;
            pow++;
        }
        return decimalnumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int n = sc.nextInt();
        System.out.println(bintoDec(n));
    }
}