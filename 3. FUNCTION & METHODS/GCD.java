// public class GCD {
//     public static void main(String args[]) {
//         int num1 = 5, num2 = 3;
//         int ans = 1;
//         for (int i = 1; i <= Math.min(num1, num2); i++) {
//             if (num1 % i == 0 && num2 % i == 0) {
//                 ans = i;
//             }
//         }
//         System.out.print("The GCD of the two number is " + ans);
//     }
// }

public class GCD {

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        while (y % x != 0) {
            int z = y % x;
            y = x;
            x = z;
        }
        System.out.println(x);
    }
}