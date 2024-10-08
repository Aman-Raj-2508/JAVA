import java.util.*;

public class Multiply {
    public static void multiply(int arr1[][], int arr2[][]) {
        int ans[][] = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                ans[i][j] = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int arr1[][] = { { 1, 2, 3 },
        // { 4, 2, 1 },
        // };
        // int arr2[][] = { { 1, 2 },
        // { 4, 5 },
        // { 1, 2 }
        // };
        int arr1[][] = { { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 },
        };
        int arr2[][] = { { 1, 2, 2 },
                { 1, 2, 2 },
                { 1, 2, 2 },
        };
        multiply(arr1, arr2);
    }
}
