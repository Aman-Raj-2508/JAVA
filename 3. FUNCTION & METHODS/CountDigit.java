public class CountDigit {
    static int count_digits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        int n = 12345;
        System.out.println("Number of digits in " + n + " is " + count_digits(n));
    }
}
