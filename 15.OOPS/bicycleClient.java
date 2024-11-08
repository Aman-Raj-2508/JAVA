public class bicycleClient {
    public static void main(String[] args) {
        // Create objects

        bicycle sportBicycle = new bicycle();

        // Accessing
        System.out.println(sportBicycle.gear);

        sportBicycle.braking();

        sportBicycle.gear = 20;
        System.out.println(sportBicycle.gear);

        // Create objects

        bicycle touringBicycle = new bicycle();

        // Accessing
        System.out.println(touringBicycle.gear);

        touringBicycle.braking();
    }
}
