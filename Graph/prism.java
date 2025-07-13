import java.util.*;

class prism{
    static class Edge {
        int src, dest, weight;
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void Mst(ArrayList<Edge>[] graph, int V) {
        boolean[] visited = new boolean[V];
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        pq.add(new Edge(-1, 0, 0));

        int mstCost = 0;
        while (!pq.isEmpty()) {
            Edge curr = pq.poll();
 
            if (visited[curr.dest]) continue;

            visited[curr.dest] = true;
            mstCost += curr.weight;
            for (Edge e : graph[curr.dest]) {
                if (!visited[e.dest]) {
                    pq.add(e);
                }
            }
        }

        System.out.println( mstCost);
    }

     public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[1].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[0].add(new Edge(1, 3, 40));
        graph[3].add(new Edge(3, 2, 50));
        Mst(graph, V);
    }
}
