import java.util.*;

public class queueUsing {

    static class Queue {
        static Deque<Integer> dq = new LinkedList<>();

        public static void add(int data) {
            dq.addLast(data);
        }

        public static int pop() {
            return dq.removeFirst();
        }

        public static int peek() {
            return dq.getFirst();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = " + q.peek());
    }

}
