
// class Node{
//     int data;
//     Node next;
//     public Node back;
//     public Node(int data,Node next,Node back){
//         this.data=data;
//         this.next=next;
//         this.back=back;
        
//     }
//     public Node(int data){
//         this.data=data;
//         this.next=null;
//         this.back=null;
//     }
// }
// public class linked7{
//     static void print(Node head){
//         while(head!=null){
//             System.out.print(head.data+" ");
//             head = head.next;
//         }
//         System.out.println();
//     }
//     static Node convert(int[] arr){
//         Node head=new Node(arr[0]);
//         Node prev= head;
//         for (int i = 1;i < arr.length;i++) {
//             Node temp=new Node(arr[i],null,prev);
//             prev.next=temp;
//             prev=temp;
            
//         }
//         return head;
//     }
//     public static void main(String[] args) {
//         int[] arr={12,5,6,8};
//         Node head=convert(arr);
//         print(head);
//     }
// }
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int arr[] = new int[10];
        int sum=0;
        for (int i = 0; i < 10; i++) {
            arr[i]=scanner.nextInt();
            sum+=arr[i];
            
        }
        System.out.println(sum);
    
    }
}