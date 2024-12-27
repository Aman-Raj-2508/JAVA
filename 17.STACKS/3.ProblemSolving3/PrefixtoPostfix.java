import java.util.Stack;

public class PrefixtoPostfix {

    public static void main(String[] args) {
        System.out.println(prefixToPostfix("*+AB-CD"));
    }

    public static boolean isOperator(char x) {
        if (x == '+' || x == '-' || x == '/' || x == '*') {
            return true;
        } else {
            return false;
        }
    }

    public static String prefixToPostfix(String str) {

        StringBuilder reversedStr = new StringBuilder(str);

        reversedStr.reverse();

        Stack<String> st = new Stack<>();

        for (int i = 0; i < reversedStr.length(); i++) {
            if (isOperator(reversedStr.charAt(i))) {
                String op1 = st.pop();
                String op2 = st.pop();
                String temp = op1 + op2 + reversedStr.charAt(i);
                st.push(temp);
            } else {
                // character 'a' ==> string "a";
                st.push(Character.toString(reversedStr.charAt(i)));
            }

        }

        return st.pop();
    }

}
