public class removalClientDLL {
    public static void main(String[] args) {
        removalDLL d = new removalDLL();
        // d.addFirst(30);
        // d.addFirst(20);
        // d.addFirst(10);
        // d.display();

        d.addLast(10);
        // d.display();
        // System.out.println();
        d.addLast(20);
        d.addFirst(5);
        d.addLast(25);
        d.addLast(30);
        // d.display();
        // System.out.println();

        d.addAtIdx(15, 2);
        d.display();

        System.out.println();

        System.out.println("After removal");
        d.removeFirst();

        d.removeLast();

        d.removeAtIdx(2);
        d.display();

    }
}
