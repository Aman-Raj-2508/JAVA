// import java.util.*;

// public class Prime_Or_Not {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();

//         if (n == 2) {
//             System.out.println(n + " is a Prime number");
//         } else {
//             boolean isPrime = true;
//             for (int i = 2; i <= n - 1; i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                 }
//             }

//             if (isPrime == true) {
//                 System.out.println(n + " is a Prime number ");
//             } else {
//                 System.out.println(n + " is not a prime number ");
//             }
//         }
//     }
// }

// Optimised Code

// import java.util.*;

// public class Prime_Or_Not {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();

//         if (n == 2) {
//             System.out.println(n + " is a Prime number");
//         } else {
//             boolean isPrime = true;
//             for (int i = 2; i <= Math.sqrt(n); i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                 }
//             }

//             if (isPrime == true) {
//                 System.out.println(n + " is a Prime number ");
//             } else {
//                 System.out.println(n + " is not a prime number ");
//             }
//         }
//     }
// }

import java.util.*;

public class Prime_Or_Not {
    public static int Prime(int n) {
        if (n == 2) {
            return 1;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prime(n);
        int result = Prime(n);
        if (result == 1) {
            System.out.println("Prime number");
        } else {
            System.out.println("Non prime");
        }
    }
}