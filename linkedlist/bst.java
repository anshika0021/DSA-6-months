public class bst {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static class BST {
        Node root;
        public Node insert(Node root, int value) {
            if (root == null) {
                return new Node(value);
            }
            if (value < root.data) {
                root.left = insert(root.left, value);
            } else if (value > root.data) {
                root.right = insert(root.right, value);
            }
            return root;
        }
        public void inorder(Node root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }
        public static delete(Node root){
            if(root.data<val){
                root.left=delete(root.left);
            }
        }
    }


    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for(int i=0;i<values.length;i++){
            root = insert(tree.root,values[i]);
        }
        tree.inorder(tree.root);  
    }
}
