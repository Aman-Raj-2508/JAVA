public class isPrime {
    public static void main(String args[]) {
        int number = 16;
        int result = nearestPrime(number);
        System.out.println("Nearest prime no is: " + result);
    }

    public static int nearestPrime(int num) {

        int lower = num - 1;
        int upper = num + 1;

        while (true) {

            if (lower >= 2 && isprime(lower)) {
                return lower;
            }
            if (isprime(upper)) {
                return upper;
            }

            lower--;
            upper++;
        }

    }

    public static boolean isprime(int num) {

        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}