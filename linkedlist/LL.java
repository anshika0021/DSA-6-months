class Node {
    int data;
    Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;


    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println(value + " inserted at the end.");
    }
    public void deleteNode(int position) {
        if (head == null) {
            System.out.println("List is empty! Nothing to delete.");
            return;
        }

        Node temp = head;

        if (position == 1) {
            head = head.next;
            System.out.println("Deleted node with value: " + temp.data);
            return;
        }

        Node prev = null;
        for (int i = 1; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position! Node not found.");
            return;
        }

        prev.next = temp.next;
        System.out.println("Deleted node with value: " + temp.data);
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();

        list.deleteNode(2);  
        list.display();

        list.deleteNode(1);  
        list.display();
    }
}
