public class disjoint{int n =7;
    int parent[] = new int[n];
    int rank[] = new int[n];
    
    public  void init(){
        for (int i = 0; i <n; i++) {
            parent[i] = i;
            rank[i] = 0;

        }
    }
    public int find(int x){
        if(x == parent[x]){
            return x;

        }
        return find(parent[x]);
    }
    public  void union(int a,int b){
        int parentA = find(a);
        int parentB = find(b);
        if(rank[parentA] == rank[parentB]){
            parent[parentB] = parentA;
            rank[parentA]++;
        }
        else if(rank[parentA] < rank[parentB]){
            parent[parentA] = parentB;
        }
        else{
            parent[parentB] = parentA;
        }
    }
    public static void main(String[] args) {
        disjoint ds = new disjoint();
        ds.init();
        ds.union(1,3);
        System.out.println(ds.find(3));
        ds.union(2,4);
        ds.union(3,6);
        ds.union(1,4);
        System.out.println(ds.find(3));
        
    }

}
       