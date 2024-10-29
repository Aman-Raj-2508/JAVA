public class lampClient {
    public static void main(String[] args) {
        lamp led = new lamp();
        lamp halogen = new lamp();

        led.turnon();

        halogen.turnoff();
    }
}
