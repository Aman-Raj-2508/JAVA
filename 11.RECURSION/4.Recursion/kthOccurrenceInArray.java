public class kthOccurrenceInArray {

    public static void msin(String args[]) {
        int arr[] = { 2, 3, 5, 7, 1, 2, 5, 2 };
        int k = 2;
        System.out.println(findOccurence(arr, k,0));
    }

    public static int[] findOccurence(int arr[], int k,int idx) {
        if (idx == arr.length) {
            return 0;
        }
        if (arr[idx] == k) {
           
        }
        findOccurence(arr, k, idx + 1);
    }

}
