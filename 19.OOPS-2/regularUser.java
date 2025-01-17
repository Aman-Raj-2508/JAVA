public class regularUser extends user {

    public regularUser(String username, String email) {
        super(username, email);
    }

    public void browseProducts() {
        System.out.println("Customer is browsing products");
    }

    @Override
    public void showDashboard() {
        System.out.println("Regular user personalised dashboard");
    }
}
