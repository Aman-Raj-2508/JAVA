public class insertionDLL {

    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
        }
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addFirst(int data) {
        Node n1 = new Node(data);
        n1.next = head;
        if (head != null) {
            head.prev = n1;
        }
        head = n1;
    }

    public void addLast(int data) {
        if (head == null) {
            addFirst(data);
            return;
        }

        Node n2 = new Node(data);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n2;
        n2.prev = temp;
    }

    public void addAtIdx(int data, int idx) {
        if (idx < 0) {
            return;
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node n3 = new Node(data);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        Node forward = temp.next;
        temp.next = n3;
        n3.next = forward;
        n3.prev = temp;
        forward.prev = n3;
    }
}
