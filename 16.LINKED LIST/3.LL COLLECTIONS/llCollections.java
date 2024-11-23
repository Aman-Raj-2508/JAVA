
import java.util.LinkedList;

public class llCollections {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        animals.add("dog");// add funciton add elements at the end of Linked List
        animals.add("horse");
        animals.add("zebra");

        System.out.println(animals);

        animals.add(1, "cat"); // Adds at specific index

        System.out.println(animals);

        // many more add methods are available

        System.out.println(animals.get(2)); // to retrieve from a index

        animals.set(2, "lion"); // to replace the element at a particular index
        System.out.println(animals);

        animals.remove(1); // Removes the element
        System.out.println(animals);

        System.out.println(animals.indexOf("lion")); // tells the first index where the lion is present

        // To print all the elements
        for (String animal : animals) {
            System.out.println(animal);
        }

    }
}
