import java.util.*;

public class Largest {
    public static int findlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= largest) {
                largest = numbers[i];
            }
            if (numbers[i] <= smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 2, 6, 3, 5 };
        int result = findlargest(numbers);
        System.out.println("Largest number is: " + result);
    }
}
