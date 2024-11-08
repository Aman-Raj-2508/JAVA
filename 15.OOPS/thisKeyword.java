public class thisKeyword {
    private int var;

    thisKeyword(int var) {
        this.var = var;
    }

    public static void main(String[] args) {
        thisKeyword obj = new thisKeyword(8);
        System.out.println(obj.var);
    }

}
