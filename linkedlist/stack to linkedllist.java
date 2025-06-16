
public class stack {
    public static class Stack{
        int arr[] = new int[5];
        int i = 0; 

        void push(int x) {
            arr[i] =x;
            i++;
        }

        int pop() {
            int ans= arr[i-1];
            arr[i-1]=0;
            i--;
            return ans;

        }
        boolean isEmpty(){
            if(i==0) return true;
            return false;
        }

        int peek() {
            if (i > 0) {
                return arr[i - 1];
            } else {
                System.out.println("Stack is Empty");
                return -1;
            }
        }
        int size(){
            return i;
        }

        void print() {
            System.out.print("Stack: ");
            for (int j = 0; j < i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(7);
        System.out.println(st.pop());
        System.out.println( st.peek());
        st.pop();
    }
}
