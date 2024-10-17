import java.util.*;

public class TwoDArraySyntax {
    public static void main(String[] args) {
        int a[][] = new int[3][4];

        System.out.println(a);

        System.out.println(a.length);// rows
        System.out.println(a[0].length);// cols

        // access
        System.out.println(a[1][2]);

        // set
        a[2][3] = 100;
        System.out.println(a[2][3]);
        System.out.println();

        // another method to intialise
        int a1[][] = {
                { 1, 2, 7 },
                { 3, 4, 8 },
                { 5, 6, 9 },
        };
        // print all the elements of this array
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[0].length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }

}
