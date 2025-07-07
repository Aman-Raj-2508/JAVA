public class InvertedPyramid {
    public static void invertedPyramid(int n) {
        // for the lines
        for (int i = 1; i <= n; i++) {
            // for spaces
            int j;
            for (j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            while (j <= n) {
                System.out.print("*");
                j++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedPyramid(4);
    }
}
