
class Node{
    int data;
    Node next;
    public Node back;
    public Node(int data,Node next,Node back){
        this.data=data;
        this.next=next;
        this.back=back;
        
    }
    public Node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
public class linked7{
    static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    static Node convert(int[] arr){
        Node head=new Node(arr[0]);
        Node prev= head;
        for (int i = 1;i < arr.length;i++) {
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
            
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr={12,5,6,8};
        Node head=convert(arr);
        print(head);
    }
}