public class accessModifiers {

    // Cannot be accessed by accessModifiersClient class
    private String name;

    // So we use getter settter method because private is accessible only within the
    // same class

    // GETTER
    public String getName() {
        return name;
    }

    // SETTER
    public void setName(String nameOf) {
        name = nameOf;
    }

}
