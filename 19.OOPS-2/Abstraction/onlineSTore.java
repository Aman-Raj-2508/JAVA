public class onlineSTore {
    public static void main(String[] args) {

        product electronics = new electronics("Smartphone", 500);
        product clothing = new clothing("Shirt", 300);

        System.out.println(electronics.calculateTax());
        System.out.println(clothing.calculateShippingCost());
    }
}
