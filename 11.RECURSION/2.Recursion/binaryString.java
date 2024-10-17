public class binaryString {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(binaryStrings(n));
    }

    public static int binaryStrings(int n) {
        if (n == 1 || n == 2) {
            return n + 1;
        }
        return binaryStrings(n - 1) + binaryStrings(n - 2);
    }
}
