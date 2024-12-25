import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {

        int stock[] = { 100, 80, 60, 70, 60, 75, 85 };

        int result[] = stockSpan(stock); // Calculate the stock span in the original array

        finalStockSpan(result); // Print the final output
    }

    // Calculate stock span using a stack
    public static int[] stockSpan(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int output[] = new int[arr.length];

        // Traverse through all stock prices
        for (int i = 0; i < arr.length; i++) {
            // Pop elements from stack while current price is greater than stack's top
            // element
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // If stack is empty, current price is greater than all previous prices
            if (st.isEmpty()) {
                output[i] = i + 1; // Span is i+1 if no greater price is found in the previous days
            } else {
                output[i] = i - st.peek(); // Otherwise, the span is the difference between the current index and the
                                           // index in the stack
            }

            // Push the current index onto the stack
            st.push(i);
        }

        return output;
    }

    // Print the stock span results
    public static void finalStockSpan(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each stock span value
        }
    }
}
