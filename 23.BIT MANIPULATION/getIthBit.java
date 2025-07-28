public class getIthBit {

    public static int getithbit(int n, int i) {
        int mask = 1 << i;
        return (n & mask) != 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(getithbit(10, 2));
    }

}
