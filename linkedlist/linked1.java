
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
public class linked1{
    public static void main(String[] args) {
        int arr[]= {2,5,6,13};

        Node y = new Node(arr[2]);
        System.out.print(y.data);
    }
    

}
// printing arr of indexing 