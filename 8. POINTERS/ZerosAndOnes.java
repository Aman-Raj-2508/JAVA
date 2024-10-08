// import java.util.*;

// public class ZerosAndOnes {
//     public static void MoveZeros(int arr[]) {
//         int count_Zeros = 0;
//         int count_Ones = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 0) {
//                 count_Zeros++;
//             }
//             if (arr[i] == 1) {
//                 count_Ones++;
//             }
//         }
//         for (int i = 0; i < count_Zeros; i++) {
//             arr[i] = 0;
//         }
//         for (int i = count_Zeros; i < count_Zeros + count_Ones; i++) {
//             arr[i] = 1;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 0, 0, 1, 0, 1, 0, 1, 0, 0, 0 };
//         MoveZeros(arr);
//     }
// }

//APPROACH----2

import java.util.*;

public class ZerosAndOnes {
    public static void Zeros(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 0 };
        Zeros(arr);
    }
}