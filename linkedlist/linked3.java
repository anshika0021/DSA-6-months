
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next = next1;
    }
    Node(int data1){
        this.data= data1;
        this.next=null;
    }
};
public class linked3{
    static  Node convert(int arr[]){
        Node head= new Node(arr[0]);
        Node mover= head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node (arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]= {12,5,6,8};
        Node head = convert(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
       
    }
}
// traversal in linked list
// class Node{
//     int data;
//     Node next;
//     Node(int data1, Node next1){
//         this.data=data1;
//         this.next=next1;
//     }
//     Node(int data1){
//         this.data=data1;
//         this.next=null;
//     }

// }
// public class linked3{
//     public static void main(String[] args){
//         int arr[] ={2,3,4,5};
//         Node y= new Node(arr[0]);
//         System.out.print(y.data);
//     }
// }