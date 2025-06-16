public class upperArray{
    public static void main(String[] args) {
        int arr[] = {3,5,8,9,15,19,89};
        int n=23;
        int x=10;
        int one = upperbound(arr,n,x);
        System.out.println(one);
    }
    public static int upperbound(int arr[],int n,int x) {
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                return arr[i];
            }
        }
        return n;
    }
}