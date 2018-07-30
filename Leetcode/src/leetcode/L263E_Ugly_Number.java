package leetcode;

public class L263E_Ugly_Number {
	
	public static boolean checkUglyNumber (int num) {
		
		// catch here is that, if the number has only 2, 3, 5 as divisors
		// we can iteratively divide by them in while loop and arrive at 1
		
		if (num ==0) return false;
		
		while (num % 2 ==0) {
			num = num / 2;
		}
		
		while (num % 3 ==0) {
			num = num / 3;
		}
		
		while (num % 5 ==0) {
			num = num / 5;
		}
		
		if (num == 1) return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		// enter number to check if its ugly or not
		int num = 6;
		System.out.println(checkUglyNumber(num));		
	}

}
