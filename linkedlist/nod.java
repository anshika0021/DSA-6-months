class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    public void palindrome(Node head){
        if(head == null){
            return;
        }
        

    }
    public static void main(String[] args){
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        System.out.println(palindrome(head));
    }

}