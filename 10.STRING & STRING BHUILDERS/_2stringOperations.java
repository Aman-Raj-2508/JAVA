import java.util.*;

public class _2stringOperations {
    public static void main(String[] args) {

        // Creating a String
        String greet = "Hello World";
        System.out.println("String: " + greet);

        // To know the length
        System.out.println(greet.length());

        // joining two strings

        String first = "Java";
        String second = "Script";
        String third = "Java";

        String joinString = first.concat(second);
        System.out.println(joinString);

        String joinString1 = second.concat(first);
        System.out.println(joinString1);

        String joinString3 = second.concat(second);
        System.out.println(joinString3);

        // compare two strings
        boolean res1 = first.equals(third);
        System.out.println("res1: " + res1);

        boolean res2 = first.equals(second);
        System.out.println("res2: " + res2);

        String name1 = new String("Program1");// String Object
        String name2 = new String("Program1");// String Object

        boolean result1 = (name1 == name2);
        System.out.println("result1: " + result1);

        boolean result2 = name1.equals(name2);
        System.out.println("result2: " + result2);

        String name3 = "Program1"; // string literal
        String name4 = "Program1";// string literal

        boolean result3 = (name3 == name4);
        System.out.println("result3: " + result3);

        boolean result4 = name3.equals(name4);
        System.out.println("result4: " + result4);

        String n1 = new String("Program2");// String Object
        String n2 = n1;

        boolean r1 = (n1 == n2);
        System.out.println("r1: " + r1);

        boolean r2 = n1.equals(n2);
        System.out.println("r2: " + r2);

        // More examples
        String example = "this is a \"very\" important project"; // Escape charaters tell the compiler to escape these
                                                                 // "very" double quotes and read the line from start to
                                                                 // end
        System.out.println("Example is: " + example);

        // Immutability in Strings
        String example1 = "Hello"; // see copy for explanation
        example1 = "World";
        System.out.println(example1);

        String example2 = "Hello";
        example2 = example2.concat("World");
        System.out.println(example2);

        // Accessing the string

        String newStr = "Hello";
        char ch = newStr.charAt(0);
        System.out.println(ch);
        // To access the last element of string
        System.out.println(newStr.charAt(newStr.length() - 1));

        // substring
        // Range 0 --> Length
        System.out.println(newStr.substring(1, 4));
        System.out.println(newStr.substring(0, 5));
        // System.out.println(newStr.substring(4, 1)); //error
        System.out.println(newStr.substring(0)); // From start index to very end

        System.out.println(newStr.lastIndexOf("l"));
        System.out.println(newStr.startsWith("he"));
        System.out.println(newStr.startsWith("He"));

        // More clarification
        String s1 = "hello"; // inside the pool
        String s2 = s1;// pointing the same variable
        String s3 = "hello"; // poinitng the same variable no new hello is created
        String s4 = new String("hello"); // outside the pool

        System.out.println((s1 == s2) + "," + s1.equals(s2));
        System.out.println((s1 == s3) + "," + s1.equals(s3));
        System.out.println((s1 == s4) + "," + s1.equals(s4));
    }
}
