import java.util.*;

public class Swap {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping a = :" + a);
        System.out.println("After Swapping b = :" + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        swap(a, b);
    }
}

// Without third variable

// import java.util.*;

// public class Swap {
// public static void main(String args[]) {
// int a = 10;
// int b = 4;
// a = a + b;
// b = a - b;
// a = a - b;
// System.out.println("After Swapping a: " + a + " And b: " + b);
// }
// }
