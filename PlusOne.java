import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, it becomes 0 (carry over to the next)
            digits[i] = 0;
        }

        // If all digits were 9, we need one extra digit at the front
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // e.g., 999 + 1 = 1000
        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        System.out.println("Output: " + Arrays.toString(plusOne(digits)));

        int[] digits2 = { 9, 9, 9 };
        System.out.println("Output: " + Arrays.toString(plusOne(digits2)));
    }
}


//Multiply two numbers without using the multiplication operator
// public class MultiplyWithoutAsterisk {
//     public static int multiply(int a, int b) {
//         boolean negative = false;
//         if (a < 0) {
//             a = -a;
//             negative = !negative;
//         }
//         if (b < 0) {
//             b = -b;
//             negative = !negative;
//         }

//         int result = 0;
//         for (int i = 0; i < b; i++) {
//             result += a;
//         }

//         return negative ? -result : result;
//     }

//     public static void main(String[] args) {
//         System.out.println(multiply(5, -3)); // Output: -15
//     }
// }
