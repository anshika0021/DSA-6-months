
import com.sun.net.httpserver.Headers;

// // class Node{
// //     String data;
// //     Node next;
// //     public Node(String data){
// //         this.data=data;
// //         this.next=null;
// //     }
// //     public void addFirst(String data){
// //         Node newNode = new Node(data);
// //         if(head==null){
// //             head=newNode;
// //         }
// //         newNode.next=head;
// //         head = newNode;
// //     }
// //     public static void main(String[] args) {
// //         LL list = new LL();
// //         list.addFirst("Anshika");
// //         list.addFirst("Sharma");
        
// //     }
// // }
// class LL {
//     String data;
//     Node head;
//     public class Node {
//         String data;
//         Node next;
//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }
//     public void addLast(String data) {
//         Node newNode = new Node(data);
//         if(head == null) {
//             head = newNode;
//             return;
//         }
//         Node lastNode = head;
//         while(lastNode.next != null) {
//             lastNode = lastNode.next;
//         }

//         lastNode.next = newNode;
//     }
//     public void printList() {
//         Node currNode = head;
//         while(currNode != null) {
//             System.out.print(currNode.data+" -> ");
//             currNode = currNode.next;
//         }
//         System.out.println("null");
//     }
//     public void deletefirst(){
//         if(head==null){
//             System.out.println("the list is empty");
//             return;
//         }
//         head=head.next;

//     }
//     public void deletelast(){
//         if(head==null){
//             System.out.println("THe list is empty");
//         }
//         if(head.next==null){
//             head =null;
//         }

//         Node secondLast=head;
//         Node lastnode=head.next;
//         while(lastnode.next != null){
//             lastnode=lastnode.next;
//             secondLast=secondLast.next;
//         }
//         secondLast.next=null;

//     }
//     public static void main(String args[]) {
//         LL list = new LL();
//         list.addFirst("is");
//         list.addLast("a");
//         list.deletefirst();
//         list.printList();
//         list.addLast("list");
//         list.addFirst("Anshika");
//         list.addLast("Sharma");
//         list.deletelast();
//         list.printList();
//         list.deletefirst();
//         list.printList();
//     }
//  }
















// ?count element in ll
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
//     public static  int length(Node head){
//         int count=0;
//         Node temp = head;
//         while(temp != null){
//             temp =temp.next;
//             count++;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4};
//         Node head = new Node(arr[0]);
//         head.next = new Node(arr[1]);
//         head.next.next= new Node(arr[2]);
//         head.next.next.next = new Node(arr[3]);
//         System.out.println(length(head));

//     }
// }




// search element in the array

// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
//     public static int search(Node head,int desired){
//         Node temp = head;
//         while(temp != null){
//             if(temp.data == desired){
//                 return 1;
                
//             }
//             temp=temp.next;
            
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         int[] array={1,2,3,4,5};
//         Node head = new Node(array[0]);
//         head.next = new Node(array[1]);
//         head.next.next=new Node(array[2]);
//         head.next.next=new Node(array[3]);
//         head.next.next=new Node(array[4]);
//         int val=2;
//         System.out.println(search(head,val));
        

//     }
// }








class Node{
    int data;
    Node next;
    static Node head;
    Node(int data){
        this.data=data;
        this.next=null;

        
    }
    public static void delete(){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next=null;

    }
    public static void printList(){
        Node temp = head;
        while( temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next=new Node(arr[3]);
        head.next.next=new Node(arr[4]);
        delete();
        printList();
    }
}







// // DOubly Lisnked list

// class Node{
//     int data;
//     Node next;
//     Node back;
//     Node(int data,Node next , Node back){
//         this.data= data;
//         this.next = next;
//         this.back = back;
//     }
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.back=null;
//     }

// }
