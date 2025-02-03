public class electronics extends product {

    public electronics(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.1;
    }

    @Override
    double calculateTax() {
        return price * 0.15;
    }

    @Override
    double calculateShippingCost() {
        return 10.0;
    }
}
