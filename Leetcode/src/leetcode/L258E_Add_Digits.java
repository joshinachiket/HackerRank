package leetcode;

public class L258E_Add_Digits {
	
	// iteratively add number until we reach 1 digit sum and return true else false
	
	public static int addDigits(int num) {
		
		// one infinite while loop
		
		while (true) {
			// calculate the sum of digits here
			int sum = 0;
			
			while (num != 0) {
				int digit = num % 10;				
				sum += digit;
				num = num / 10;
			}
			
			if (sum / 10 == 0) {
				return sum;
			}			
			num = sum;			
		}
		
	}
	
	public static void main(String[] args) {
		// number that we have to add digits of
		int number = 38;
		System.out.println(addDigits(number));
	}

}
