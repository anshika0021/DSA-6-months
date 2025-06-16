// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
//     public static void  detect(Node head){
//         Node slow = head;
//         Node fast = head;
//         while(fast.next != null || fast != null ){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast){
//                 System.out.println("Loop is present");
//             }
//     }
//     System.out.println("loop is not prsent");
// }
    
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4};
//         Node head = new Node(arr[0]);
//         head.next = new Node(arr[1]);
//         head.next.next = new Node(arr[2]);
//         head.next.next.next = new Node(arr[3]);

//         detect(head);
        
//     }
// }





// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
//     public static void mid(){
//         Node slow=head;
//         Node fast=head;
//         while(fast != null){
//             if(fast.next == null || fast.next.next ==null){
//                 slow = slow.next;
//                 fast=fast.next.next;
//                 slow = mid;
//             }

//         }
//     }
//     public static void reverse(){
//         Node prev = head;
//         Node curr= prev.next;
//         Node curr.next = prev;

//         prev = curr;
//         curr = next;
//     }
//     public static void check(){
//         mid();
//         reverse();

//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,2,1};
//         Node head = new Node(arr[0]);
//         head.next=new Node(arr[1]);
//         head.next.next=new Node(arr[2]);
//         head.next.next.next=new Node(arr[3]);
//         head.next.next.next=new Node(arr[4]);
//         check(head);

//     }
// }



class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
    public static void loop(){
        Node slow = head;
        Node fast = head;
        if(head = null || head.next == null){
            return false;
        }
        
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast= fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        loop();
    }
}

