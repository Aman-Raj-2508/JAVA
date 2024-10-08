import java.util.*;

public class Decimal_to_Binary {
    public static void dectoBinary(int decimalnumber) {
        int binarynumber = 0;
        int pow = 0;
        while (decimalnumber > 0) {
            int lastdigit = decimalnumber % 2;
            binarynumber = binarynumber + (lastdigit * (int) Math.pow(10, pow));
            pow++;
            decimalnumber = decimalnumber / 2;
        }
        System.out.println("Binary number is :" + binarynumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n = sc.nextInt();
        dectoBinary(n);
    }
}
