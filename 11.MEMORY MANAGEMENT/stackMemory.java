
// PROGRAM ----1
/**
 * import java.util.*;
 * 
 * public class stackMemory {
 * public static void main(String[] args) {
 * System.out.println("Hello World");
 * greetings();
 * askQuery();
 * }
 * 
 * public static void greetings() {
 * System.out.println("Hello!Sir");
 * }
 * 
 * public static void askQuery() {
 * System.out.println("How may I help you?");
 * }
 * }
 */

//PROGRAM ----2
//  Example usign primitive values

import java.util.*;

public class stackMemory {
    public static void main(String[] args) {

        System.out.println("Hello there!");
        int defaultVal = 2;
        defaultVal = multiplyTwo(defaultVal);
        defaultVal = multiplyFour(defaultVal);
        System.out.println(defaultVal);
    }

    public static int multiplyFour(int val) {
        val *= 4;
        return val;
    }

    public static int multiplyTwo(int val) {
        val *= 2;
        return val;

    }
}