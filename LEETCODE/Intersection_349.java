import java.util.*;

public class Intersection_349 {
    public static ArrayList<Integer> intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> Result = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                if (Result.contains(nums1[i])) {
                    i++;
                    j++;
                    continue;
                }
                Result.add(nums1[i]);
                i++;
                j++;
            }
        }
        return Result;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 2, 1 };
        int nums2[] = { 2, 2 };
        System.out.println(intersection(nums1, nums2));
    }
}