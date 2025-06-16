
// import javax.swing.RootPaneContainer;

// class node{
//     static class Node {
//         int data;
//         Node left;
//         Node right;
//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     static int height(Node root){
//         if(root == null){
//             return 0;
//         }
//         int diameter = 0;
//         int left= height(root.left);
//         int right = height(root.right);
//         diameter = Math.max(diameter ,left + right);
//         return Math.max(left,right)+1;
//     }
//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.right = new Node(6);
//         System.out.println(height(root));
//     }
// }
