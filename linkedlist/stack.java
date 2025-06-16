// public class stack{
//     public static class Stack {
//         static class Node {
//             int data;
//             Node next;

//             Node(int data) {
//                 this.data = data;
//                 this.next = null;
//             }
//         }
//         private Node top;
//         public Stack() {
//             this.top = null;
//         }
//         void push(int x) {
//             Node newNode = new Node(x);
//             newNode.next = top;
//             top = newNode;
//         }

//         int pop() {
//             if (isEmpty()) {
//                 System.out.println("Stack Underflow");
//                 return -1;
//             }
//             int ans = top.data;
//             top = top.next;
//             return ans;
//         }
//         boolean isEmpty() {
//             return top == null;
//         }

//         int peek() {
//             if (isEmpty()) {
//                 System.out.println("Stack is Empty");
//                 return -1;
//             }
//             return top.data;
//         }

//         void print() {
//             Node temp = top;
//             while (temp != null) {
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Stack st = new Stack();
//         st.push(2);
//         st.push(4);
//         st.push(6);
//         st.push(8);
//         st.push(7);
//         st.print();
//         System.out.println(st.pop());
//         System.out.println( st.peek());
//         st.pop();
//         st.print();
//     }

// }



