public class fab{
    static int fabno(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fabno(n-1)+fabno(n-2);
    }
    public static void main(String[] args) {
        
        int n=6;
        
        System.out.println(fabno(n));
    }
}
