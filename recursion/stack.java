import java.util.Stack;

public class stack{ 

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);
        
        reverse(st);
        
        System.out.println("Reversed Stack: " + st);
    }

   
    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return; 
        }

        int top = st.pop();

        reverse(st);

        insertAtBottom(st, top);
    }

    private static void insertAtBottom(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item); 
            return;
        }

        // Remove top element
        int top = st.pop();

        // Recursively insert item at bottom
        insertAtBottom(st, item);

        // Push the removed element back
        st.push(top);
    }
}
