import java.util.*;

public class SetZeroMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 3, },
                { 2, 5, 9 },
                { 1, 6, 8 }
        };
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    if (rows.contains(i)) {
                        if (cols.contains(j)) {
                            continue;
                        } else {
                            cols.add(j);
                        }
                    } else {
                        rows.add(i);
                        cols.add(j);
                    }
                }
            }
        }

        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[rows.get(i)][j] = 0;
            }
        }

        for (int i = 0; i < cols.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j][cols.get(i)] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
