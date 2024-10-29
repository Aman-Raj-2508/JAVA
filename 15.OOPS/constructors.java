public class constructors {

    private String name;

    // No arg constructor
    constructors() { // no paramter
        System.out.println("Constructor called");
        name = "Aman";
    }

    // parameterised constructors
    constructors(String lang) { // with paramter so here is construcotr overloading with diferent number of
                                // paramteres
        name = lang;
        System.out.println(name + " is a programming language ");
    }

    // Accessing is done inside main menthod
    public static void main(String[] args) {

        // accessing the no arg constructors
        constructors obj = new constructors();
        System.out.println("The name is " + obj.name);

        // accessing the parameterised constructor
        constructors obj1 = new constructors("Java");

    }
}
