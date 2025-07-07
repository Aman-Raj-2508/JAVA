
public class InvertedPyramidNumbers {
    public static void invertedPyramidNumbers(int n) {
        for (int i = 0; i < n; i++) {
            int k = 1;
            for (int j = 0; j < (n - i); j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        invertedPyramidNumbers(n);
    }
}
