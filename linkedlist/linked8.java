
import java.util.Currency;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data,Node next,Node prev){
        this.data=0;
        this.next=null;
        this.prev=null;

    }
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    Node reverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node prev=null;
        node Current = head;
        while (current!=null){
            prev= current.prev;
        }
    }
}
