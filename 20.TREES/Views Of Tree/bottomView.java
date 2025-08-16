import java.util.*;

public class bottomView {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node n, int h) {
            node = n;
            hd = h;
        }
    }

    public static void printBottomView(Node root) {
        if (root == null)
            return;
        Map<Integer, Integer> bottomViewMap = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair curr = q.remove();
            bottomViewMap.put(curr.hd, curr.node.data);
            if (curr.node.left != null) {
                q.add(new Pair(curr.node.left, curr.hd - 1));
            }
            if (curr.node.right != null) {
                q.add(new Pair(curr.node.right, curr.hd + 1));
            }
        }
        for (int value : bottomViewMap.values()) {
            System.out.print(value + " ");
        }
    }

}
