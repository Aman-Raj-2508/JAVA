import java.util.*;

public class _3isPalindrome {
    public static void main(String[] args) {
        String str = "NamaN";

        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
