package LnkedList;

public class Node {
	public String bookName;
	public int millionsSold;
	
	public Node next;
	
	public Node (String bookName, int millionsSold) {
		this.bookName =  bookName;
		this.millionsSold = millionsSold;
	}
	
	public void display() {
		System.out.println("bookName: " + bookName + "millionsSold: " + millionsSold);
	}
	
	public String toString () {
		return bookName;
	}
	
	public static void main(String args[]) {
		
	}
}
