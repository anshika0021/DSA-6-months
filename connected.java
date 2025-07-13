import java.util.*;
public class connected{
    static class  Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }

    }
    public static void dfs(ArrayList<Edge>[] graph,int V,boolean visited[]){
        visited[V] = true;
        System.out.println(V);
        for(Edge e : graph[V]){
            if(!visited[e.dest]){
                dfs(graph,e.dest,visited);
            }
        }
    }
    public static void connected(ArrayList<Edge>[] graph,int V){
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(graph,i,visited);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[3].add(new Edge(3,4));
        connected(graph,V);
    }
}