public class insertionLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
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

    // Insertion at beginning
    public void addFirst(int data) {
        Node nn = new Node(data); // nn is the object for node class not for insertion class
        nn.next = this.head; // assigning the arrow between the previous head and this new node
        this.head = nn; // updating the head and making the newly node as head
    }

    // Insertion at last
    public void addLast(int data) {
        if (this.head == null) {
            addFirst(data);
            return;
        }
        Node n = new Node(data);
        Node temp = this.head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    // Insertion at idx
    public void addAtIdx(int data, int idx) {
        if (idx < 0) {
            return;
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node n3 = new Node(data);
        Node temp = this.head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        Node forward = temp.next;
        temp.next = n3;
        n3.next = forward;
    }
}
