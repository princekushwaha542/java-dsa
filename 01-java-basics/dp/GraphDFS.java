package graph;

import java.util.*;

public class GraphDFS {

    private final int vertices;
    private final List<List<Integer>> adj;

    GraphDFS(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int source, int destination) {
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }

    void dfs(int current, boolean[] visited) {

        visited[current] = true;
        System.out.print(current + " ");

        for (int neighbor : adj.get(current)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        GraphDFS graph = new GraphDFS(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        boolean[] visited = new boolean[5];

        System.out.println("DFS Traversal:");

        graph.dfs(0, visited);

        System.out.println();
    }
}