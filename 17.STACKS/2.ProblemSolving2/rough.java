import java.util.Stack;

public class rough {
    public static void main(String[] args) {

        int stock[] = { 100, 80, 60, 70, 60, 75, 85 };

        int orriginal[] = new int[stock.length];

        for (int i = 0; i < stock.length; i++) {
            orriginal[i] = stock[i];

        }

        int revArr[] = reverse(stock);

        int result[] = stockSpan(revArr);

        int finalOutput[] = reverse(result);

        for (int i : finalOutput) {
            System.out.print(i + " ");
        }

        int indexedArr[] = indexcal(finalOutput, orriginal);

        for (int i : indexedArr) {
            System.out.print(i + " ");
        }

        System.out.println();

        finalStockSpan(indexedArr);
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

    public static int[] stockSpan(int arr[]) {
        Stack<Integer> st = new Stack<>();

        int output[] = new int[arr.length];
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

    public static int[] indexcal(int arr[], int orriginal[]) {

        int indexedArr[] = new int[arr.length]; // Create a new array to store the indexes.

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < orriginal.length; j++) {
                if (arr[i] == orriginal[j]) {
                    indexedArr[i] = j; // Store the index in the indexedArr.
                    break;
                }
            }
        }
        return indexedArr; // Return the array with indexes.
    }

    public static void finalStockSpan(int arr[]) {

        int result[] = new int[arr.length];

        result[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            result[i] = i - arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i]);
        }
    }
}