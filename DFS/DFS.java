import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    public static void main(String arg[]){
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println(
                "Depth First Traversal "
                        + "(starting from vertex 2)");

        graph.dfs(0);
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
    void dfs(int s){
        boolean visited[] = new boolean[V];

        Stack stack = new Stack();
        visited[s] = true;
        stack.add(s);

        while (stack.size() !=0){
            s = stack.remove();
            System.out.println(s+" ");

            Iterator<Integer> i = adj[s].listIterator();

            while (i.hasNext()){
                int n=i.next();
                if (!visited[n]){
                    visited[n]= true;
                    stack.add(n);
                }
            }
        }
    }

}
