package Practise;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
	
	public static void swap (int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void modifyList (ArrayList<String> li) {
		li = new ArrayList();
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("before swapping: " + "a: " + a + " b: " + b );
		swap (a,b);
		System.out.println("after swapping: " + "a: " + a + " b: " + b );
		
		ArrayList<String> st = new ArrayList<> ();
		st.add("a");
		st.add("b");
		st.add("c");
		
		for (String s:st) {
			System.out.print(s+" -> ");
		}
		
		modifyList(st);
		
		for (String s:st) {
			System.out.print(s+" -> ");
		}
	}

}
