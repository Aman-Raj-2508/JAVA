public class main {
    private String name;

    main() {
        System.out.println("Constructor called");
        name = "Aman";

    }

    public static void main(String[] args) {
        main obj = new main();
        System.out.println("Th name is " + obj.name);
    }
}
