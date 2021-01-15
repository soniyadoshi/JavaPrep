package datastructures;

import java.util.LinkedList;
import java.util.List;

/*
Adjaceny List with weights
 */
public class GraphWithList {
    int vertices;
    List<Edge> list[];

    public GraphWithList (int n) {

        list = new LinkedList[n];
        this.vertices = n;

        for (int i=0; i<list.length; i++) {
            list[i] = new LinkedList<>();
        }

    }

    public void printGraph() {
        for (int i=0; i< vertices; i++) {
            System.out.println(i + " ---> " + list[i]);
        }
    }

    public void addEdge(int u, int v, int w) {

        list[u].add( new Edge(v,w));
    }

    public boolean isConnected(int u, int v) {
        for (Edge e : list[u]) {
            if (e.v == v) {
                return true;
            }
        }
        return false;
    }

    public static void main (String args[]) {

        GraphWithList g = new GraphWithList(5);
        g.addEdge(0, 2, 10);
        g.addEdge(0, 3, 11);
        g.addEdge(2, 3, 9);
        g.addEdge(3, 4, 6);
        g.addEdge(2, 5, 50);
        g.printGraph();
        System.out.println(g.isConnected(0, 4));

    }
    class Edge {
        //end vertex, weight
        int v, w;

        public Edge (int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "v=" + v +
                    ", w=" + w +
                    '}';
        }
    }
}

