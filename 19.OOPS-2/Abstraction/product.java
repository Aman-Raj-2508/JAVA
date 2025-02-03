abstract class product {
    protected String name;
    protected double price;

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    abstract double calculateTax();

    abstract double calculateShippingCost();
}
