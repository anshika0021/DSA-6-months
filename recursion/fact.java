public class fact{
    static int facto(int n){
        if(n<=1){
            return 1;
        }
        return n *facto(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(facto(n));
        

        
    }
}