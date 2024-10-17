import java.util.*;

public class HollowRectangle {

    public static void printRectangle(int tot_rows, int tot_cols) {
        for (int i = 1; i <= tot_rows; i++) {
            for (int j = 1; j <= tot_cols; j++) {
                if (i == 1 || i == tot_rows || j == 1 || j == tot_cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total rows and cols: ");
        int tot_rows = sc.nextInt();
        int tot_cols = sc.nextInt();
        printRectangle(tot_rows, tot_cols);
    }
}