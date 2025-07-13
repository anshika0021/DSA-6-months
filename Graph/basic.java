import java.util.ArrayList;

public class basic{

    public static class Edge {
        int src, dest, weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));

        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 1, 1));

        graph[1].add(new Edge(1, 3, 3));
        graph[3].add(new Edge(3, 1, 3));

        graph[2].add(new Edge(2, 4, 2));
        graph[4].add(new Edge(4, 2, 2));

        for (int i = 0; i < V; i++) {
            System.out.print("Node " + i + " connects to: ");
            for (Edge e : graph[i]) {
                System.out.print("(" + e.dest + ", w=" + e.weight + ") ");
            }
            System.out.println();
        }
    }
}
