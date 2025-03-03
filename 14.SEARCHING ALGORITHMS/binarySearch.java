public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 8 };
        int key = 8;
        System.out.println(binarysearch(arr, key));

    }

    public static int binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else {
                if (arr[mid] < key) {
                    start = mid + 1; // lesser values than target
                } else {
                    end = mid - 1; // greater values than target
                }
            }
        }
        return -1;
    }
}
