public class klevel {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    int Sum=0;
    public void klevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            Sum += root.data;
            return;
        }
        klevel(root.left, level + 1, k);
        klevel(root.right, level + 1, k);
    }
    public static void main(String[] args) {
        klevel tree = new klevel();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k = 3; 
        tree.klevel(root, 1, k); 
        System.out.println(tree.Sum);
    }
}
