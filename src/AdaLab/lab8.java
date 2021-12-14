package AdaLab;

class CreateGraph {
      static class CreateEdge {
            int src, dest, weight;

            CreateEdge() {
                  src = dest = weight = 0;
            }
      }

      ;
      int V, E;
      CreateEdge edge[];

      CreateGraph(int v, int e) {
            V = v;
            E = e;
            edge = new CreateEdge[e];
            for (int i = 0; i < e; ++i)
                  edge[i] = new CreateEdge();
      }

      void BellmanFord(CreateGraph graph, int s) {
            int V = graph.V, E = graph.E;
            int dist[] = new int[V];
            for (int i = 0; i < V; ++i)
                  dist[i] = Integer.MAX_VALUE;
            dist[s] = 0;
            for (int i = 1; i < V; ++i) {
                  for (int j = 0; j < E; ++j) {
                        int u = graph.edge[j].src;
                        int v = graph.edge[j].dest;
                        int w = graph.edge[j].weight;
                        if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v])
                              dist[v] = dist[u] + w;
                  }
            }
            for (int j = 0; j < E; ++j) {
                  int u = graph.edge[j].src;
                  int v = graph.edge[j].dest;
                  int w = graph.edge[j].weight;
                  if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                        System.out.println("CreateGraph contains negative wcycle");
                        return;
                  }
            }
            printSolution(dist, V);
      }

      static void printSolution(int dist[], int V) {
            System.out.println("Vertex Distance from Source");
            for (int i = 0; i < V; ++i)
                  System.out.println(i + "\t\t" + dist[i]);
      }
}

public class lab8 {
      public static void main(String[] args) {
            System.out.println("Bellman Ford Algo\n");
            int V = 5;
            int E = 8;
            CreateGraph graph = new CreateGraph(V, E);
            graph.edge[0].src = 0;
            graph.edge[0].dest = 1;
            graph.edge[0].weight = -1;

            graph.edge[1].src = 0;
            graph.edge[1].dest = 2;
            graph.edge[1].weight = 4;

            graph.edge[2].src = 1;
            graph.edge[2].dest = 2;
            graph.edge[2].weight = 3;

            graph.edge[3].src = 1;
            graph.edge[3].dest = 3;
            graph.edge[3].weight = 2;

            graph.edge[4].src = 1;
            graph.edge[4].dest = 4;
            graph.edge[4].weight = 2;

            graph.edge[5].src = 3;
            graph.edge[5].dest = 2;
            graph.edge[5].weight = 5;

            graph.edge[6].src = 3;
            graph.edge[6].dest = 1;
            graph.edge[6].weight = 1;
            graph.edge[7].src = 4;
            graph.edge[7].dest = 3;
            graph.edge[7].weight = -3;
            graph.BellmanFord(graph, 0);
      }
}
