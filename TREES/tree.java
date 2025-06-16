public class tree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree {
        static int idx = -1;

        public static Node Buildtree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = Buildtree(node);
            newNode.right = Buildtree(node);
            return newNode;
        }
    }

    public static void main(String args[]) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = binarytree.Buildtree(node);  // fix class name & method name
        System.out.println(root.data);           // fix typo in 'println'
    }
}
