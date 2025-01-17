public class user {
    private String username;

    private String email;

    public user(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void login() {
        System.out.println(username + "Logged in");
    }

    public void showDashboard() {
        System.out.println(username + "'s dashboard");
    }

}
