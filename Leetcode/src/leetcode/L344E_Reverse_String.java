package leetcode;

import java.util.Iterator;
import java.util.Stack;

public class L344E_Reverse_String {
	
	public static String reverseString(String s) {
		
		// get a stack to store reverse characters
		Stack <Character> stk = new Stack <Character>();
		
		// get a stringbuilder to return as a strin
		StringBuilder sb = new StringBuilder();
		
		char[] ch = s.toCharArray();
		
		for (int i=0;i<s.length();i++) {
			stk.push(ch[i]);
		}
		
		Iterator itr = stk.iterator();
		
		while (itr.hasNext()) {
			sb.append(stk.pop());
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// put your string to reverse here
		String str = "bass ka bhau";
		System.out.println(reverseString(str));
	}
}
