import java.util.*;
public class kosaraju{
    static class Edge{
        int src,dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;        
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));        
        graph[3].add(new Edge(2,1));
        graph[3].add(new Edge(2,1));
        graph[4].add(new Edge(3,4)); 
    } 
    public static void topsort(ArrayList<Edge> graph[],int curr,boolean visited[] ,Stack<Integer> s) {
        visited[curr] = true;
        for(int i =0;i<graph[curr].size();i++){
            Edge e   = graph[curr].get(i);
            if(!visited[e.dest]){
                topsort(graph, e.dest, visited, s);
            }
        }
        s.push(curr);
    }
    public static void kosaraju(ArrayList<Edge> graph[],int V){
        boolean visited[] = new boolean[V];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                topsort(graph, i, visited, s);
            }
        }
    }
    public static 

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 5,dest =1;
       boolean visited[] = new boolean[V];
    }
} 