public class accessModifiersClient {
    public static void main(String[] args) {
        accessModifiers aM = new accessModifiers();
        // Cannot acces the name variable
        // aM.name = "Aman";

        // by the help of getter and setter we can access the name vriable

        aM.setName("Aman");
        System.out.println(aM.getName());
    }

}
