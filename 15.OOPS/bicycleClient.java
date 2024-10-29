public class bicycleClient {
    public static void main(String[] args) {
        // Create objects

        bicycle sportBicycle = new bicycle();

        // Accessing
        System.out.println(sportBicycle.gear);

        sportBicycle.braking();

        // Create objects

        bicycle touringBicycle = new bicycle();

        // Accessing
        System.out.println(touringBicycle.gear);

        touringBicycle.braking();
    }
}
