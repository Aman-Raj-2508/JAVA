import java.util.HashMap;

public class hashMapOperaions {

    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Put - O(1) Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get - O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // ContainsKey - O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indonesia"));

        // Remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        System.out.println(hm.remove("China"));
    }
}
