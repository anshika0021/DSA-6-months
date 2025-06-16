public class c1{
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(8);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
            
        }
    }
}



































// public class c1{
//     public static class Circularqueue{
//         int front =0;
//         int rear = 0;
//         int size =0;
//         int [] arr = new int[5];
//         public  void add(){
//             if(size == arr.length){
//                 System.out.println("Queue is full");
//             }
//             else if(size==0){
//                 rear = front =0;
//                 arr[0] = 6;
//             }
//             else if(rear<front-1){
//                 arr[rear++] = rear;
//             }
//             else if(rear<arr.length-1){
//                 rear =0;
//                 arr[0] = 6;
//             }
//         }
//         public void remove(){
//             if(size==0){
//                 System.out.println("Queue is Empty");
//             }
//             else if(front<arr.length-1){
//                 int val = arr[front];
//                 front =0;
//                 return val;
//             }
//         }

//     }
//     public static void main(String[] args) {
        
//     }
// }