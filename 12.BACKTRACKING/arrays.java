public class arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        f(arr, 0, 1);
        print(arr);
    }

    public static void f(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            print(arr);
            return;
        }
        // recurssion
        arr[i] = val;
        f(arr, i + 1, val + 1);
        // undo
        arr[i] = arr[i] - 2;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
}
