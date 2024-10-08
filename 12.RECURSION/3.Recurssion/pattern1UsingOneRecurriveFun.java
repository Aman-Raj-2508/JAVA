public class pattern1UsingOneRecurriveFun {
    public static void main(String[] args) {
        f(1, 1, 5);
    }

    public static void f(int row, int col, int n) {
        if (row > n)
            return;// all rows are printed
        if (col > n) {
            System.out.println(); // new line before going to next row
            f(row + 1, 1, n);// all col of given row are done ,move to next row
            return;
        }
        System.out.print("*");
        f(row, col + 1, n);
    }
}
