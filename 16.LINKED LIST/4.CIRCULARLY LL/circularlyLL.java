
public class circularlyLL {
    Node head;
    Node tail;

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = this.head;
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head" + temp.data);
    }

    // Insert At Head
    public void insertAtHead(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            this.head = n1;
            this.tail = n1;
            n1.next = head;
        } else {
            n1.next = head;
            this.head = n1;
            this.tail.next = head;
        }
    }

    // Insert At Tail
    public void insertAtTail(int data) {
        if (head == null) {
            insertAtHead(data);
            return;
        }
        Node n2 = new Node(data);
        n2.next = this.head;
        tail.next = n2;
        this.tail = n2;
    }

    // Delete At Head
    public int deleteAtHead() {
        int removedValue = 0;
        if (head == null) {
            return removedValue;
        } else if (this.head == this.tail) { // single node

            this.head = this.tail = null;

        } else { // more than one
            removedValue = this.head.data;
            this.head = this.head.next;
            this.tail.next = this.head;
        }
        return removedValue;
    }

    // Delete At Tail
    public int deleteAtTail() {
        int removedValue = 0;
        if (head == null) {
            return removedValue;
        } else if (this.head == this.tail) {
            this.head = this.tail = null;
        } else {

            Node prev = head;
            while (prev.next != tail) {
                prev = prev.next;
            }

            removedValue = tail.data;
            this.tail = prev;
            this.tail.next = head;
        }
        return removedValue;
    }

}
