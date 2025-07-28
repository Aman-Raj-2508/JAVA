public class setIthBit {

    public static int setithbit(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }

    public static void main(String[] args) {
        System.out.println(setithbit(10, 2));
    }

}
