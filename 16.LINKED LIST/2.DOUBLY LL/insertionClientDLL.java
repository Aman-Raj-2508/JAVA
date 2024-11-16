public class insertionClientDLL {
    public static void main(String[] args) {
        insertionDLL d = new insertionDLL();
        // d.addFirst(30);
        // d.addFirst(20);
        // d.addFirst(10);
        // d.display();

        d.addLast(10);
        d.display();
        System.out.println();
        d.addLast(20);
        d.addFirst(5);
        d.display();
        System.out.println();

        d.addAtIdx(15, 2);
        d.display();
    }
}
