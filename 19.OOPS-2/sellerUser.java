public class sellerUser extends user {

    public sellerUser(String username, String email) {
        super(username, email);
    }

    public void addProducts() {
        System.out.println("Seller is adding a new product");
    }

    @Override
    public void showDashboard() {
        System.out.println("Seller user personalised dashboard");
    }

}
