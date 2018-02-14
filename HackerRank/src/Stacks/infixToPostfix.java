package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class infixToPostfix {
	

	public static String infixToPrefixConversion(String infix) {
		// TODO Auto-generated method stub
		Stack<Character> stk = new Stack<Character>();
		String postfix = "";
		
		
		for (int i=0;i< infix.length();i++) {
			char c = infix.charAt(i);
			
			// if the character is an operand output it to the postfix string
			
			if (Character.isLetterOrDigit(c)) {
				postfix += c;
			} else if (c == '(') {
				// if the scanned character is opening bracket then push it to the stack
				stk.push(c);
			} else if (c == ')') {
				// is the scanned character is closing bracket
				// pop from stack till we encounter a opening bracket on TOP of stack
				
				while (!(stk.isEmpty()) || stk.peek() != '(') {
					
					// while stack is not empty and (peek == returns top element of stack)
					postfix += stk.pop();
				}
				
				
			}
			
		}
		
		
		
		return null;
	}
	
	public static void main(String[] args) {
		int testCases = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number of cases");
		testCases = input.nextInt();
		
		for (int i=0;i<testCases;i++) {
			String infix = input.next();
			
			String result = infixToPrefixConversion(infix);
			
			System.out.println("infix " + infix + " converts to " + result);
		}
	}


}
