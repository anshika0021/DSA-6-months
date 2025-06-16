import java.util.*;

public class method2
{
    public static void merge(int []arr, int s, int mid, int e){
        List<Integer> ll = new ArrayList<Integer>();
        int l = s;
        int r = mid+1;
        
        while(l<=mid && r<=e){
            if(arr[l] < arr[r]){
                ll.add(arr[l]);
                l++;
            }
            else{
                ll.add(arr[r]);
                r++;
            }
        }
        
        if(l<=mid){
            while(l<=mid){
                ll.add(arr[l]);
                l++;
            }
        }
        
        if(r<=e){
            while(l<=mid){
                ll.add(arr[r]);
                r++;
            }
        }
        
        for(int i=s;i<=e;i++){
            arr[i] = ll.get(i-s);
        }
    }
    
    public static void mergeSort(int []arr, int s, int e){
        if(s<e){
            int mid = s+(e-s)/2;
            mergeSort(arr,s,mid);
            mergeSort(arr,mid+1,e);
            merge(arr, s, mid, e);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        mergeSort(arr, 0, n-1);
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
	}
}