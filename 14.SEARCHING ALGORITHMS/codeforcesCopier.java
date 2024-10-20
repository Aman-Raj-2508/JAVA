import java.util.*;

public class codeforcesCopier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print(minTime(n, x, y));
    }

    public static int minTime(int n, int x, int y) {
        if (n == 1) {
            return Math.min(x, y);
        } else {
            int low = 0;
            int high = Math.max(x, y) * n;

            int ans = 0;
            while (low <= high) {

                // Actually mid represents the time
                int mid = (low + high) / 2;
                // good function checks if the mid time range is enough for making n copies or
                // not to make n-1 copies.
                if (good(n, x, y, mid)) { // if good funciton returns true then only this will execute
                    ans = mid; // If this function executes that means mid time is enough to make (n-1) copies
                               // but as per
                               // the question we have to minimise the time so we move left to find minimum
                               // time value.
                    high = mid - 1;
                } else { // Otherwise mid time is not enough so we move right towards more time value.
                    low = mid + 1;
                }

            }
            return ans + Math.min(x, y);
        }
    }

    public static boolean good(int n, int x, int y, int mid) {
        // Objective of this function is:
        // If in mid amount of time , I am able to make (n-1) copies or not
        // If I am able then my mid value is good , then return true

        // In order to do so , we can check how many copies can be made in mid amount of
        // time
        // If no of copies >= (n-1) then return true, otherwise return false

        // c1 copier can make mid/x copies in mid time => 1 copy in x amout of time so
        // in mid amount of time mid/x.

        // c2 copier can make mid/y copies in mid time => 1 copy in y amout of time so
        // in mid amount of time mid/y.

        return (mid / x) + (mid / y) >= (n - 1);

    }
}
