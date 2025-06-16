public class scan{
    public static void greater(int[] arr){
        int n = arr.length;
        int[] one = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(stack != isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                one[i] == -1;
            }
            else{
                one[i]=peek(i);
            }
            stack.push(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            greater(arr);
        }
        sc.close();
    }
}

