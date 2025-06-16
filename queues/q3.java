public class q3 {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val=val;
        }
    }
    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            if (size == 0) {
                tail = null; 
            }
            return x;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Queue elements:");
        q.display();
        System.out.println("Peek: " + q.peek());
        System.out.println("Removed: " + q.remove());
        System.out.println("Queue after removal:");
        q.display();
        System.out.println("Is queue empty? " + q.isEmpty());
        q.remove();
        q.remove();
        System.out.println("Is queue empty now? " + q.isEmpty());
        q.remove();
    }
}

// unlimited size
// LL works a queue