public class binarysearchoverAnswer {
    public static void main(String[] args) {
        int x = 16;
        System.out.print(binaryAnswer(x));
    }

    public static int binaryAnswer(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid * mid) == x) {
                return mid;
            } else {
                if ((mid * mid) > x) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return 0;
    }
}
