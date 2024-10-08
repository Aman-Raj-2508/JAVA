public class pattern3 {
    public static void main(String[] args) {
        f(5, 1, 5);
    }

    public static void f(int row, int col, int n) {
        if (row == 0) {
            return;
        }
        if (col > row) {
            System.out.println();
            f(row - 1, 1, 4);
            return;
        }
        System.out.print("*");
        f(row, col + 1, n);
    }
}
