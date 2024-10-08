import java.util.*;

public class Inverted_Star {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
