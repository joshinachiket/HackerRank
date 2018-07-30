package leetcode;

public class L202E_Happy_Number {
	
	public static boolean happyNumber (int number) {
		
		while (true) {
			int sum = 0;
			
			while (number != 0) {
				sum += (number%10) * (number%10);
				number = number / 10;
			}
			
			// the catch here is that the sum at one point will always become 1 or 7
			// outer if makes sure that the sum reaches to a point where it is one digit so you
			// cant ignore that if
			if (sum / 10 == 0) {
				if ((sum == 1) || (sum == 7)) {
					return true;
				} else {
					return false;
				}
			}
			
			// assign the new number to num
			number = sum;						
		}
		
	}
	
	public static void main(String[] args) {
		// number to check is happy or not
		int number = 19;
		System.out.println(happyNumber(number));
	}
	

}
