public class adminUser extends user {

    public adminUser(String username, String email) {
        super(username, email); // it automatically calls the user class constructor
    }

    public void manageProducts() {
        System.out.println("Admin is managing products");
    }

    @Override
    public void showDashboard() {
        super.showDashboard(); // User class function will be called whenever we do au.showDashboard().
        System.out.println("Admin user personalised dashboard");

    }

    public static void main(String[] args) {
        adminUser au = new adminUser("Aman", "aman906@gmail.com"); // Object of admin class made
        au.login(); // this login method is not made in this admin class, but we are able to access
                    // it because we have inherited from user which is a super class
        au.manageProducts();

        au.showDashboard(); // run this by commenting overrride fucntion once and then withouth comenting .
                            // You see the output difference.
                            // What if we want to call the showdashboard function of Super class even after
                            // overriding . We can do that by using Super keyword.
    }
}
