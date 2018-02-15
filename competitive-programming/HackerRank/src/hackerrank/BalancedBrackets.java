package hackerrank;


import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static String isBalanced(String expression) {
		// TODO Auto-generated method stub
		// check if the expression is even in length
		
		String result = "balanced";
		if ((expression.length() & 1) == 1) {
			result = "not balanced";
		} else {
			// convert incominf steing into characrers
			char [] brackets = expression.toCharArray();
			Stack<Character> stk = new Stack<Character>();
			
			for (int i=0;i< expression.length();i++) {
				
				if (expression.charAt(i) == '(') {
					stk.push(')');
				} else if (expression.charAt(i) == '{') {
					stk.push('}');
				} else if (expression.charAt(i) == '[') {
					stk.push(']');
				} else {
					if (stk.isEmpty() || expression.charAt(i) != stk.peek()) {
						result = "not balanced";
					}
					stk.pop();
				}
				
			}
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		int testCases = 0;
		Scanner input = new Scanner(System.in);

		testCases = input.nextInt();

		for (int i = 0; i < testCases; i++) {
			System.out.println("Enter string to test");
			String expression = input.next();
			String result = isBalanced(expression);

			System.out.println("String " + expression +" is " + result);

		}

	}

}
