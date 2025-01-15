public class binaryNumber {
    public static void main(String[] args) {
        int n = 2;
        decimalTobin(n);
    }

    public static void decimalTobin(int n) {
        for (int i = 1; i <= n; i++) {
            int binNum = 0;
            int pow = 0;
            int num = i;
            while (num > 0) {
                int ld = num % 2;
                binNum += ld * (int) Math.pow(10, pow);
                pow++;
                num /= 2;
            }
            System.out.println(binNum + " ");
        }
    }
}