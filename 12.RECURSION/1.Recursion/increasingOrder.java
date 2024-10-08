import java.util.*;

public class increasingOrder {
    public static void main(String[] args) {
        increasingOrder(5);
    }

    public static void increasingOrder(int n) {
        if (n == 0) {
            return;
        }

        increasingOrder(n - 1);
        System.out.println(n);

    }
}
