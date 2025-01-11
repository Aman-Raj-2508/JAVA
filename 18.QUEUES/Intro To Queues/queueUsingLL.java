public class queueUsingLL {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // addLast
    public void enqueue(int x) {
        Node nn = new Node(x);
        // for 1st element
        if (this.tail == null) {
            this.head = this.tail = nn;
            return;
        }
        tail.next = nn;
        tail = tail.next;

    }

    // remove first-->O(n)
    public int dequeue() {
        if (this.head == null) {
            System.out.println("Queue is already empty");
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
            System.out.println("Queue is already empty");
            return -1;
        }

        int peekValue = this.head.data;

        return peekValue;
    }
}
