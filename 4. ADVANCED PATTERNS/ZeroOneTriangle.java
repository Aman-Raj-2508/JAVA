import java.util.*;

public class ZeroOneTriangle {
    public static void ZeroOne_triangle(int n) {
        // outer loop for lines
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        ZeroOne_triangle(n);
    }
}
