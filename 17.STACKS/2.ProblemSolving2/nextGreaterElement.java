import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 4, 2, 9, 10, 11, 3, 2 };

        int result[] = nge(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] nge(int arr[]) {

        int n = arr.length;
        int output[] = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(0);

        for (int i = 1; i < arr.length; i++) {

            while ((!st.isEmpty()) && (arr[st.peek()] < arr[i])) {
                int index = st.pop();
                output[index] = arr[i];
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
