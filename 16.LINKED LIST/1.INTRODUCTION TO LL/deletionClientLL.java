public class deletionClientLL {
    public static void main(String[] args) {
        deletionLL ll = new deletionLL(); // making the object of inserionLL class

        // add first
        ll.addFirst(20);
        ll.display(); // 20
        ll.addFirst(15);
        ll.display(); // 15 20
        ll.addFirst(7);
        ll.display();// 7 15 20
        ll.addFirst(40);
        ll.display();// 40 7 15 20
        ll.addFirst(35);
        ll.display();// 35 40 7 15 20

        // add last
        ll.addLast(100);
        ll.display();// 35 40 7 15 20 100
        ll.addLast(99);
        ll.display(); // 35 40 7 15 20 100 99
        ll.addLast(80);
        ll.display(); // 35 40 7 15 20 100 99 80

        // insert at idx
        ll.addAtIdx(250, 3);
        ll.display();// 35 40 7 250 15 20 100 99 80

        // remove first
        ll.removeFirst();
        ll.display();// 40 7 250 15 20 100 99 80

        // remove last
        ll.removeLast();
        ll.display(); // 40 7 250 15 20 100 99

        // remove at idx
        ll.removeAtIdx(2);
        ll.display(); // 40 7 15 20 100 99
    }
}
