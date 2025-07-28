public class clearLastIthBit {

    public static int clearlastIthBit(int n, int i) {
        int mask = (-1 << i); // Create a mask with the last i bits set to 1
        return n & mask; // Clear the last i bits
    }

    public static void main(String[] args) {
        System.out.println(clearlastIthBit(15, 2)); // Clear last 2 bits of 15 (1111 in binary)
    }

}
