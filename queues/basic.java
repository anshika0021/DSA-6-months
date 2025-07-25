public class basic{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
    }
    
    Queue(){
        arr= new int[n];
        size = n;
        rear = -1;
    } 
    public static boolean isEmpty(){
        return rear=-1;
    }
    public static void add(int data){
        if(rear==n-1){
            System.out.println("Queue is full");
            return;
        }
        rear = rear+1;
        arr[rear]=data;

    }
    public static int remove(int data){
        if(isEmpty()){
            System.out.println("queue Empty");
            return -1;
        }
        int front=arr[0];
        for(i=0;i<rear;i++){
            arr[i]=arr[i+1];

        }
        rear = rear-1;
        return front;

    }
    public static int peek(){
        if(isEmpty()){
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
       
    }
}