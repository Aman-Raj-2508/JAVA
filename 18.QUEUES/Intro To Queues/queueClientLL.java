public class queueClientLL {
    public static void main(String[] args) {
        queueUsingLL ll = new queueUsingLL();

        ll.enqueue(1);
        ll.enqueue(2);
        ll.enqueue(3);
        System.out.println(ll.peek());

        ll.dequeue();
        ll.dequeue();

        ll.display();
        System.out.println(ll.peek());
    }
}
