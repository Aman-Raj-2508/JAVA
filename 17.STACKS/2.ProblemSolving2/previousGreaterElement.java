import java.util.Stack;

public class previousGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 4, 2, 9, 10, 11, 3, 2 };

        int revArr[] = reverse(arr);

        int result[] = nge(revArr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

        return arr;
    }

    public static int[] nge(int revArr[]) {

        int n = revArr.length;
        int output[] = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(0);

        for (int i = 1; i < revArr.length; i++) {

            while ((!st.isEmpty()) && (revArr[st.peek()] < revArr[i])) {
                int index = st.pop();
                output[index] = revArr[i];
            }

            st.push(i);
        }

        while (!st.isEmpty()) {
            int index = st.pop();
            output[index] = -1;
        }

        return output;

    }
}
