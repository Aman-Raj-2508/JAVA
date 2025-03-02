import java.util.*;

public class Iterniary {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = startPoint(tickets);
        System.out.println(start);

        for (String key : tickets.keySet()) {
            System.out.println("->" + tickets.get(start));
            start = tickets.get(start);
        }
    }

    public static String startPoint(HashMap<String, String> tickets) {

        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // starting point
            }
        }
        return null;
    }
}