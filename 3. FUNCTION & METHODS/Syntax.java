// When return type is void
// import java.util.*;

// public class Syntax {
//     public static void PrintHello() {
//         System.out.println("Hello");
//         System.out.println("Hello");
//         System.out.println("Hello");
//     }

//     public static void main(String[] args) {
//         PrintHello();
//     }
// }

//When return type is int
import java.util.*;

public class Syntax {
    public static float PrintHello() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        return 5.0f; // Must have a return value of float type be it 2 ,3,4,5 any value
    }

    public static void main(String[] args) {
        PrintHello();
    }
}