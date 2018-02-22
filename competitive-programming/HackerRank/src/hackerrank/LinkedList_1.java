package hackerrank;

// create a linked list and add three elements in it and display

public class LinkedList_1 {
	
	public static void main(String[] args) {
		// create node 1
		LinkedListNode node1 = new LinkedListNode();
		node1.data = 1;
		
		// create node 2
		LinkedListNode node2 = new LinkedListNode();
		node2.data = 3;
		
		// create node 3
		LinkedListNode node3 = new LinkedListNode();
		node3.data = 5;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		LinkedListNode temp = node1;
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
}
