import java.util.HashSet;

public class hashSetOperations {

    public static void main(String args[]) {

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set); // Prints only 1 2 4

        if (set.contains(2)) {
            System.out.println("Set conatins 2 "); // prints
        }
        set.remove(2);
        System.out.println(set); // Prints only 1 4
        if (set.contains(2)) {
            System.out.println("Set contains 2 "); // does not prints
        }
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());

    }
}