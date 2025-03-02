import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String args[]) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Patna");
        cities.add("Noida");
        cities.add("Varanashi");
        cities.add("Jaipur");
        System.out.println(cities); // return in random order

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Patna");
        lhs.add("Noida");
        lhs.add("Varanashi");
        lhs.add("Jaipur");
        System.out.println(lhs); // returns the order in which the insertion is done
    }
}
