public class powerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false; // Power of two must be positive
        return (n & (n - 1)) == 0; // Check if only one bit is set
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(18)); // false
    }

}
