public class treesize {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void printTree(Node root) {
        if (root == null) return;

        System.out.print("Node: " + root.val);
        if (root.left != null) System.out.print(", Left: " + root.left.val);
        if (root.right != null) System.out.print(", Right: " + root.right.val);
        System.out.println();

        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(4);
        root.right = new Node(10);
        root.left.left = new Node(6);
        root.left.right = new Node(5);
        root.right.right = new Node(11);

        printTree(root);  
    }
}
