import java.util.*;

public class Syntax {

    public static void main(String[] args) {
        ArrayList<Integer> arraylist1 = new ArrayList<>();
        ArrayList<String> languages = new ArrayList<>();

        // adding element
        languages.add("JAVA");
        languages.add("JAVASCRIPT");
        languages.add("C++");
        languages.add(1, "Swift");// adding at specific index

        // to print
        System.out.println(languages);
        System.out.println(languages.size());

        // accsess the element
        String str = languages.get(1);// Method 1
        System.out.println(str);

        System.out.println(languages.get(1));// Method 2

        // Change the elements
        languages.set(1, "C++");
        System.out.println(languages);

        // remove
        languages.remove(2);
        System.out.println(languages);
        System.out.println(languages.size());

        // using loop
        for (String language : languages) {
            System.out.println(language);
        }
    }
}