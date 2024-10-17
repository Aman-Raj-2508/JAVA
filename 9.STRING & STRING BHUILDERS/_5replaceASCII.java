import java.util.*;

// public class _5replaceASCII {

//     public static void main(String[] args) {

//         replaceAscii("cdEfG");
//     }

//     public static void replaceAscii(String str) {
//         for (int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);
//             if (i % 2 == 0) {
//                 ch++;
//             } else {
//                 ch--;
//             }
//             System.out.println(ch);
//         }
//     }
// }

// Above function prints characterwise

public class _5replaceASCII {

    public static void main(String[] args) {

        System.out.println(replaceAscii("cdEfG"));
    }

    public static String replaceAscii(String str) {

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {

            char ch = sb.charAt(i);
            if (i % 2 == 0) {
                ch++;
                sb.setCharAt(i, ch);
            } else {
                ch--;
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();

    }
}