public class printpermutationBacktracking {
    public static void main(String[] args) {
        printpermutation("abc", 0, 2);
    }

    public static void printpermutation(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
            return;
        } else {
            for (int i = l; i <= r; i++) {
                // do
                str = swap(str, l, i);
                // recursively call
                printpermutation(str, l + 1, r);
                // undo
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int l, int i) {
        char temp;
        char arr[] = a.toCharArray();
        temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;

        return String.valueOf(arr);
    }
}
