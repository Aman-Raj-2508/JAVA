public class clearRangeOfBits {

    public static int clearrangeOfBits(int n, int i, int j) {
        // Create a mask with bits from i to j set to 0
        int a = -1 << (j + 1);
        int b = (1 << i) - 1;
        int mask = a | b; // Combine the two masks
        return n & mask; // Clear bits from i to j
    }

    public static void main(String[] args) {
        System.out.println(clearrangeOfBits(10, 2, 4)); // Clear bits from index 2 to 4 of 10 (1010 in binary)
    }

}
