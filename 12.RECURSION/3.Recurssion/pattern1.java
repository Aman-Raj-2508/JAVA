public class pattern1 {
    /** --------------> Approach 1 */

    // public static void main(String[] args) {
    // printPattern(5, 5);
    // }

    // public static void printPattern(int n, int totalrows) {
    // if (n == 0) {
    // return;
    // }

    // printStar(totalrows);
    // printPattern(n - 1, totalrows);
    // }

    // public static void printStar(int totalrows) {
    // for (int i = 0; i < totalrows; i++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    /** -------------> Approach 2 */
    public static void main(String[] args) {
        f(5, 5);
    }

    public static void f(int n, int totalrows) {
        if (n == 0) {
            return;
        }

        g(totalrows); // Calls this function to print the pattern
        // at this point we have n stars printed
        // let's go to the new line
        System.out.println();

        f(n - 1, totalrows);
    }

    public static void g(int totalrows) { // Tis function print n stars
        if (totalrows <= 0) {
            return;
        }
        System.out.print("*");
        g(totalrows - 1);
    }
}
