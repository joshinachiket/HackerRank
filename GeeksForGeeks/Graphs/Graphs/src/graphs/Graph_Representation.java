package graphs;
import java.util.*;

public class Graph_Representation {
	
	// a static user defined class representation for graph
	// a graph will have a list of linked lists names adjacency lists
	// and V as number of vertices
	public static class Graph{
		int v; // declare a variable for number of vertices
		LinkedList<Integer> adjList[]; // array of linked lists
		// constructor
		Graph (int vertices) {
			this.v = vertices;
			adjList = new LinkedList[v];
			
			for (int i=0;i<v;i++) {
				adjList[i] = new LinkedList<>();
			}
		}
	}

	// static method to add edge between two vertices in the graph
	public static void addEdge (Graph graph, int src, int dest) {
		// use linkedList method addFirst
		// addFirst - adds the element in the linked list at the first position
		// add - adds the element int the linked list at the last position
		graph.adjList[src].addFirst(dest);
		// if the graph is NOT directed then we need to add the reverse edge also
		graph.adjList[dest].addFirst(src);
	}
	
	// static utility function to display the graph
	public static void display (Graph graph) {
		// loop over each vertex and print its adjaency list
		for (int i=0;i<graph.v;i++) {
			System.out.println("The Adjacency List for Vertex " + i);
			System.out.print("head");
			for (Integer adjVertex: graph.adjList[i]) {
				System.out.print(" --> " + adjVertex);
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		// declare vertices here
		int V = 5;
		Graph graph = new Graph(V);
		// add edges here
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        // display graph here
        display(graph);
	}

}
