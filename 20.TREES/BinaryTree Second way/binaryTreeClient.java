public class binaryTreeClient {

    public static void main(String[] args) {

        binaryTree b = new binaryTree();
        b.root = new Node(10);
        b.root.left = new Node(20);
        b.root.right = new Node(30);
        b.root.left.left = new Node(40);

        // b.inorder(b.root);
        // b.preorder(b.root);
        // b.postorder(b.root);

        // b.levelorder(b.root);

        // boolean res = b.find(b.root, 90);
        // System.out.println(res);

        System.out.println(b.height(b.root));
    }
}
