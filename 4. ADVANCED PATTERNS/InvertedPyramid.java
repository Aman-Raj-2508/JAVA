public class InvertedPyramid {
    public static void invertedPyramid(int n) {
        // for the lines
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedPyramid(4);
    }
}
