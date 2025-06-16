public class lowerArray{
    public static int lowerbound(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]>=x){
                return arr[i];
            }
        }
        return n;
    }
    public static void main(String [] args){
        int arr[] ={3,5,8,15,19};
        int n=5;
        int x=9;
        int r =lowerbound(arr,n,x);
        System.out.println(r);
    }
}














// sliding 
// binary tree,dp,linked list,graph
