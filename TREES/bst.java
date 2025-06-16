import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class bst {
    static Scanner sc = new Scanner(System.in);
    static Node insertBST(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insertBST(root.left, data);
        else if (data > root.data)
            root.right = insertBST(root.right, data);
        return root;
    }
    static boolean searchBST(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        else if (key < root.data) return searchBST(root.left, key);
        else {
            return searchBST(root.right,key);
        }
    }
    static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp == null) {
                System.out.println();
                if (!q.isEmpty()) q.add(null);
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = null;

        System.out.println("Enter values to insert into BST (enter -1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == -1) break;
            root = insertBST(root, val);
        }

        System.out.println("\nLevel Order Traversal of BST:");
        levelOrder(root);

        System.out.print("\nEnter value to search in BST: ");
        int key = sc.nextInt();
        boolean found = searchBST(root, key);

    }
}
