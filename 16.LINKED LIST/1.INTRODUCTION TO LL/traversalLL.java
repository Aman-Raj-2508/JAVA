public class traversalLL {
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
}
