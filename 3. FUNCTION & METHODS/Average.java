// import java.util.*;

// public class Average {
//     public static double findaverage(double x, double y, double z) {
//         double average = (x + y + z) / 3;
//         return average;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the three number: ");
//         double x = sc.nextDouble();
//         double y = sc.nextDouble();
//         double z = sc.nextDouble();
//         double result = findaverage(x, y, z);
//         System.out.println(result);
//     }

// for n numbers

import java.util.*;

public class Average {

    public static double findaverage(double n) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        double average = sum / n;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = findaverage(n);
        System.out.println(result);
    }
}

// if we have to find by different number we will do by dowhile loop