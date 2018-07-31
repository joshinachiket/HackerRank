package graphs;
import java.beans.VetoableChangeListener;
import java.util.*;

public class DFS_Graph {
	// user defined grah class with adjacensy list approach
	public static class Graph {
		int v; // total vertices
		LinkedList<Integer> adjList[];
		// constructor
		Graph (int vertices) {
			this.v = vertices;
			adjList = new LinkedList[v];
			
			for (int i=0;i<v;i++) {
				adjList[i] = new LinkedList<>();
			}
		}
	}
	
	// utility method to display graph
	public static void display (Graph graph) {
		for (int i=0;i<graph.v;i++) {
			System.out.print("The adjacency of vertex -> " + i );
			for (Integer adjVertex : graph.adjList[i]) {
				System.out.print(" -> " + adjVertex);
			}
			System.out.println("\n");
		}
	}
	
	// add edge in directed graph
	public static void addEdge (Graph graph, int src, int dest) {
		graph.adjList[src].add(dest);
	}
	
	public static void DFSUtil (Graph graph, int head, boolean [] visited) {
		// mark the passed head as visited
		visited [head] = true;
		System.out.print(head + " -> ");
		
		Iterator<Integer> itr = graph.adjList[head].listIterator();
		
		while (itr.hasNext()) {
			int current = itr.next();
			// recursively call DFS if node is not visited
			if (!visited[current]) {
				DFSUtil (graph, current, visited);
			}
		}
	}
	
	public static void DFS (Graph graph, int head) {
		// remember that the DFS required recursion
		// and recursion means a helper function in most cases
		boolean [] visited = new boolean [graph.v];
		DFSUtil (graph, head, visited);
	}
	
	public static void main(String[] args) {
		int vertices = 4; // total vertices in graph
		int head = 2; // vertex to stat the DFS
		Graph graph = new Graph (vertices);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 1, 2);
		addEdge(graph, 2, 0);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 3);
		
		display(graph);
		DFS(graph, head);
	}
}
