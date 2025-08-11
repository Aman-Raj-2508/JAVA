import java.util.*;

public class Shuffle {

    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 3, 4, 5 };
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            int j = getRandomNumberInRange(0, i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        for (int songs : arr) {
            System.out.print(songs);
        }
    }

    public static int getRandomNumberInRange(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Max must be greater than or equal to min");
        }

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}