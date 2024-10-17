import java.util.*;

public class decreasingOrder {
    public static void main(String[] args) {
        decreasingOrder(5);
    }

    public static void decreasingOrder(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        decreasingOrder(n - 1);
    }
}
