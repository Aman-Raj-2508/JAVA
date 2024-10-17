import java.util.*;

public class Product {
    public static int findProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = findProduct(a, b);
        System.out.println("Product is: " + result);
    }
}
