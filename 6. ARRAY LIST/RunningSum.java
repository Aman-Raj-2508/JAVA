import java.util.*;

public class RunningSum {
    public static ArrayList<Integer> runningSum(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum = sum + arr[j];
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(runningSum(arr));
    }
}
