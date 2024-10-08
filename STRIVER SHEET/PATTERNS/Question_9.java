public class Question_9 {
    public static void print(int n) {
        // 1st half
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j <= (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (1 + 2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = (n - 1); i >= 0; i--) {
            // spaces
            for (int j = 0; j <= (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (1 + 2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
