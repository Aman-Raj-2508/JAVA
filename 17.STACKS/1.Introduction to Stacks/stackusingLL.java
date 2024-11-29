public class stackusingLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // addatHead
    public void push(int x) {
        Node nn = new Node(x);
        nn.next = this.head;
        this.head = nn;
    }

    // removeFirst
    public int pop() {
        if (this.head == null) {
            System.out.println("Stack is already empty");
            return -1;
        }

        int removedValue = this.head.data;
        this.head = this.head.next;

        return removedValue;

    }

    public void display() {
        System.out.println("---------------------");
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("---------------------");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() { // displays the top element
        if (this.head == null) {
            System.out.println("Stack is already empty");
            return -1;
        }

        int removedValue = this.head.data;

        return removedValue;
    }

}
