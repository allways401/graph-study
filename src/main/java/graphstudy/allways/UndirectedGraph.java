package graphstudy.allways;

import java.util.ArrayList;

public class UndirectedGraph implements graphstudy.UndirectedGraph {

    // vertices
    private int V;
    // number of edges
    private int E;
    private ArrayList<ArrayList<Integer>> adj;

    public UndirectedGraph() {}

    public UndirectedGraph(int V) {
        this.V = V;

        this.adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            this.adj.add(new ArrayList<Integer>());
        }
        this.E = 0;
    }
    @Override
    public graphstudy.UndirectedGraph create(int V) {
        return new UndirectedGraph(V);
    }

    @Override
    public void addEdge(int v, int w) {
        adj.get(v).add(w);
        adj.get(w).add(v);
        E++;
    }

    @Override
    public Iterable<Integer> adj(int v) {
        return adj.get(v);
    }

    @Override
    public int V() {
        return this.V;
    }

    @Override
    public int E() {
        return this.E;
    }

    @Override
    public int degree(int v) {
        return adj.get(v).size();
    }
}
