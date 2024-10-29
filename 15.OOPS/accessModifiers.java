public class accessModifiers {

    // Cannot be accessed by accessModifiersClient class
    private String name;

    // So we use getter settter method

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
