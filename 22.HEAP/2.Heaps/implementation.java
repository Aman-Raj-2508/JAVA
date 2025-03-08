import java.util.ArrayList;

public class implementation {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add at last index
            arr.add(data);

            int x = arr.size() - 1; // x is child index
            int par = (x - 1) / 2; // Parent index

            // Fixing the heap property (Min Heap)
            while (x > 0 && arr.get(x) < arr.get(par)) { // Added boundary condition
                // Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // Move upwards
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(10);
        heap.add(5);
        heap.add(15);
        heap.add(1);

        System.out.println("Top element (Min Heap): " + heap.peek()); // Should print 1
    }
}
