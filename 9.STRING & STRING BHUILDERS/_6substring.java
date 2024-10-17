import java.util.*;

public class _6substring {
    public static void main(String[] args) {
        substring("abc");
    }

    public static void substring(String str) {
        for (int si = 0; si < str.length(); si++) {
            for (int ei = si + 1; ei <= str.length(); ei++) {
                System.out.println(str.substring(si, ei));
            }
            System.out.println();
        }
    }
}

/** Using charAt function by me */

// import java.util.*;

// public class _6substring {
// public static void main(String[] args) {
// substring("code");
// }

// public static void substring(String str) {
// for (int si = 0; si < str.length(); si++) {
// for (int ei = si; ei < str.length(); ei++) {

// for (int k = si; k <= ei; k++) {
// System.out.print(str.charAt(k));
// }
// System.out.println();

// }
// System.out.println();
// }
// }
// }