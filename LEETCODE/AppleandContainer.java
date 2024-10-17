import java.util.*;

public class AppleandContainer {
    public static void main(String[] args) {
        int apple[] = { 1, 3, 2 };
        int Capacity[] = { 5, 4, 3, 2, 1 };
        int tapple = 0;
        int count = 0;
        int tcapacity = 0;

        for (int i = 0; i < apple.length; i++) {
            tapple += apple[i];
        }

        Arrays.sort(Capacity);
        for (int j = Capacity.length - 1; j >= 0; j--) {
            tcapacity += Capacity[j];
            count++;
            if (tcapacity >= tapple) {
                break;
            }
        }
        System.out.println(count);
    }
}
