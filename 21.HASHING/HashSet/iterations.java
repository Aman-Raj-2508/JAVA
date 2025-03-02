import java.util.*;

public class iterations {

    public static void main(String args[]) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Patna");
        cities.add("Noida");
        cities.add("Varanashi");
        cities.add("Jaipur");

        // Iterator it = cities.iterator();

        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}