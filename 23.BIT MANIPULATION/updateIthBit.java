public class updateIthBit {
    
    public static int updateithbit(int n, int i, int bitValue) {
        int mask = 1 << i;
        if (bitValue == 1) {
            return n | mask; // Set the ith bit
        } else {
            mask = ~mask; // Clear the ith bit
            return n & mask;
        }
    }

    public static void main(String[] args) {
        System.out.println(updateithbit(10, 2, 1)); // Set 2nd bit
        System.out.println(updateithbit(10, 1, 0)); // Clear 1st bit
    }
}
