import java.util.*;
class dfs{
    public static boolean  Cyclic(int curr,boolean vis[] ,boolean stack[],ArrayList<Integer> graph[]){
        vis[curr] = true;
        stack[curr] = true; 
        for (int neighbor : graph[curr]) {
    if (!vis[neighbor]) {
        if (Cyclic(neighbor, vis, stack, graph)) {
            return true;
        }
    } else if (stack[neighbor]) {
        return true;
    }
}

stack[curr] = false; 
return false;


    }
    public static boolean cyclic(int V,ArrayList<Integer> graph[]){
        boolean vis[] = new boolean[V];
        boolean stack[] = new boolean[V];
        for(int i =0 ;i<V;i++){
            if(!vis[i]){
                if(Cyclic(i,vis,stack,graph)){
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int V = 6;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(1);
        graph[1].add(2);
        graph[2].add(3);
        graph[3].add(4);
        graph[4].add(5);
        graph[5].add(2);
        if(cyclic(V,graph)){
            System.out.print("cycle");
        }
        else{
            System.out.print("no cycle");
        }
    }
}