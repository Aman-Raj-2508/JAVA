import java.util.*;

public class _4stringBuilders {

    public static void main(String[] args) {

        String str = "hello";
        StringBuilder sb = new StringBuilder("abc");
        StringBuilder sb1 = new StringBuilder(str);

        // length
        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println(sb1);
        System.out.println(sb1.length());

        // append
        sb1.append("abc");
        System.out.println(sb1);

        // insert
        // range --> 0 --> length
        sb.insert(0, "z");
        System.out.println(sb);

        sb.insert(sb.length(), "f"); // at the last index it is added
        System.out.println(sb);

        // setCharAt()
        sb.setCharAt(2, 'q');
        System.out.println(sb);

        // string BUilder to String
        String str1 = sb.toString();// coverts back to String
        System.out.println("String: " + str1);

    }
}
