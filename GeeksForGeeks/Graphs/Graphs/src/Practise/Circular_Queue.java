package Practise;

// circular queue implementation in java
// data structure used is array
public class Circular_Queue {
	int rear = -1;
	int front = -1;
	int size;
	int [] circ_queue;
	
	Circular_Queue (int maxSize) {
		this.size = maxSize;
		circ_queue = new int [size];
	}
	
	public void enqueu (int item) {
		// if the cq is full, we can not add the element
		// full condition
		// 1 2 3 4 5
		// because we always add at the rear of the queue
		System.out.println("front: " + front + " rear: " + rear);
		if ((rear + 1) % size == front) {
			System.out.println("CQ is full. Please deque elements");
		} else {
			// start of the cq
			if ((rear == front) && rear == -1) {
				front++;
			}
			
			//normal addition
			rear = (rear + 1) % size;
			circ_queue[rear] = item;
		}
		System.out.println("front: " + front + " rear: " + rear);
		
	}
	
	public int dequeue () {
		System.out.println("front: " + front + " rear: " + rear);
		int item = 0;
		// because we deque always from the front
		// if the dequeue is empty
		if ((rear == front) && front == -1) {
			System.out.println("CQ is empty. Please enque elements");
		} else {
			item = circ_queue[front];
			circ_queue[front] = 0;
			// end of the cq
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				if ((front + 1) >= size) {
					front = 0;
				} else {
					front++;
				}
			}
		}
		System.out.println("front: " + front + " rear: " + rear);
		System.out.println("Element Dequed: " + item);
		return item;
	}
	
	public void display (Circular_Queue cq) {
		for (int i=0;i<size;i++) {
			System.out.print(circ_queue[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		int size = 5;
		Circular_Queue cq = new Circular_Queue(size);
		
		// enque
		cq.enqueu(1);
		cq.display(cq);
		cq.enqueu(2);
		cq.display(cq);
		cq.enqueu(3);
		cq.display(cq);
		cq.enqueu(4);
		cq.display(cq);
		cq.enqueu(5);
		cq.display(cq);
		cq.enqueu(6);
		
		// deque
		cq.dequeue();
		cq.display(cq);
		cq.dequeue();
		cq.display(cq);
		cq.dequeue();
		cq.display(cq);
		cq.enqueu(1);
		cq.display(cq);		
		cq.dequeue();
		cq.display(cq);
		cq.dequeue();
		cq.display(cq);
		cq.dequeue();
		cq.display(cq);
		cq.dequeue();
		cq.display(cq);
	}
}
