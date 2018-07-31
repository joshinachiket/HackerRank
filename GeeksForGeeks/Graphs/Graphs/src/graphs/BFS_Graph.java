package graphs;
import java.util.*;

public class BFS_Graph {
	// create a user defined graph class
	public static class Graph {
		int v; // number of vertices
		LinkedList<Integer> adjList[]; // adjacency list contains list of adjacent vertices
		
		// constructor
		Graph (int vertices) {
			this.v = vertices;
			adjList = new LinkedList[v];
		
			for (int i=0;i<v;i++) {
				adjList[i] = new LinkedList<>();
			}
		}
	}
	
	// public static method to add edges
	public static void addEdge (Graph graph, int src, int dest) {
		// this is going to be directed graph thus add edge last
		graph.adjList[src].add(dest);
	}
	
	// utility function to display the graph
	public static void display (Graph graph) {
		for (int i=0;i<graph.v;i++) {
			System.out.print("The adjacenct of vertex " + i);
			for (Integer adjVertex : graph.adjList[i]) {
				System.out.print( " -> " + adjVertex);
			}
			System.out.println("\n");
		}
	}
	
	public static void BFS (Graph graph, int head) {
		
		System.out.println("<----BFS OF GRAPH---->");
		Queue <Integer> queue = new LinkedList<>();
		// remember always
		// MARK VISITED AND THEN ADD IN QUEUE
		// declaring a boolean is default false
		// and false means not visited
		boolean [] visited = new boolean [graph.v];
		visited [head] = true;
		queue.add(head);

		
		while (!queue.isEmpty()) {
			// poll head of queue, print and mark as visited
			int current = queue.poll();
			System.out.print(current + " -> ");
	
			// add its adjacency list in queue
			Iterator<Integer> iter = graph.adjList[current].listIterator();
			while (iter.hasNext()) {
				// add in queue only if not visited
				int node = iter.next();
				if (!visited[node]) {
					visited[node] = true;
					queue.add(node);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int vertices = 4; // number of total vertices in graph
		int head = 2; // BFS or DISPLAY start vertex
		Graph graph = new Graph(vertices);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 1, 2);
		addEdge(graph, 2, 0);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 3);
		
		display(graph);
		BFS(graph, head);
		
	}
}
