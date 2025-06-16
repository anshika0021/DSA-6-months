
 class Result {
    static int checkPalindrome(Node head) {

        if(head == null || head.next == null){
            return 1;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        Node curr = slow;
        Node previous = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        Node left = head;
        Node right = previous;
        while(left != null && right != null){
            if(left.data != right.data){
                return 0;
                
            }
            left = left.next;
            right = right.next;
            
        }
        return 1;
    }
  }