import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    public static void main(String arg[]){
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Breadth First Traversal "+
                "(starting from vertex 2)");

        graph.bfs(2);
    }

}

class Graph{
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v){
        V=v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i){
            adj[i]=new LinkedList();
        }
    }
    void addEdge(int v, int W){
        adj[v].add(W);
    }

    void bfs(int s){
        boolean visited[] = new boolean[V];

        Queue queue = new Queue();
        visited[s] = true;
        queue.enqueue(s);

        while (queue.size() !=0){
            s = queue.dequeue();
            System.out.println(s+" ");

            Iterator<Integer> i = adj[s].listIterator();

            while (i.hasNext()){
                int n=i.next();
                if (!visited[n]){
                    visited[n]= true;
                    queue.enqueue(n);
                }
            }
        }
    }

}
