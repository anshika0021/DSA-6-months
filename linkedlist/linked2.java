
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
public class linked2{
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
        System.out.print(head.data);
    }
}
// printing head in a linked list