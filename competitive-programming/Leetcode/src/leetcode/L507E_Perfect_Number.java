package leetcode;

public class L507E_Perfect_Number {
	
	public static boolean checkPerfectNumber(int num) {
		// TODO Auto-generated method stub
		
		// if the number that we have to check is 1 return false as 
		// 1 is not a perfect number
		if (num == 1) return false;
		
		
		// Initialize the sum
		int sum = 0;
		
		// to find the divisors of a number we need not have a loop till the number
		// we need to have a loop only till ,= sqrt of number
		
		for (int i=2;i<=Math.sqrt(num);i++) {
			
			// check if the i divides num completely
			if (num % i == 0) {
				
				// add the i and num/i to sum
				sum = sum + i + num/i;				
				
			}
			
		}
		
		// as 1 is divisor of every number we have to 1 to each sum		
		sum++;
		
		
		
		return (sum==num);

	}
	
	
	public static void main(String[] args) {
		// replave int with number you want to check
		int num = 36;
		
		System.out.println(checkPerfectNumber(num));
	}

}
