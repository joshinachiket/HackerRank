package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L728E_Self_Dividing_Numbers {
	
	public static List<Integer> selfDividingNumber (int left, int right) {
		
		List <Integer> answer = new ArrayList<Integer>();
		
		for (int i=left;i<=right;i++) {
			
			// lets use a helper function for simplicity
			if (checkNumber(i)) answer.add(i);			
		}		
		return answer;		
	}
	
	public static boolean checkNumber (int number) {
		// assign the number to a local variable
		int temp = number;
		
		// while loop till the division of the number by 10 does not give a 0
		
		while (temp != 0) {
			// declare integer to calculate the left most digit of the number
			int digit = temp % 10;
			
			// we have two conditions, 1. a perfect number can NOT have a 0 in it
			// 2. each digit of the number completely divides the number
			if ((digit == 0) || (number % digit != 0)) {
				return false;
			}
			// calculate temp to remove left most digit
			temp = temp / 10;			
		}
		return true;
	}
	
	public static void main(String[] args) {
		// assign your left and right limits here
		int left = 1;
		int right = 22;
		
		List<Integer> answer = selfDividingNumber(left, right);
		
		for (Integer number : answer) {
			System.out.print(number + " ");
		}
				
	}
	
}
