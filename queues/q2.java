public class q2 {
    public static class q {
        int front = -1;
        int rear = -1;
        int[] arr = new int[100];
        int size = 0;

        public void add(int val) {
            if (size == 0) {
                front = 0;
                rear = 0;
                arr[rear] = val;
            } else {
                rear++;
                arr[rear] = val;
            }
            size++;
        }

        // Dequeue
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[front];
            front++;
            size--;
            return val;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }
    public static void main(String[] args) {
        q queue = new q();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
