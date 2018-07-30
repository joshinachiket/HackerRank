package leetcode;

public class L204E_Count_Primes {
	
	public static int countPrime (int n)  {
		
		int count = 0;

		// initially mark all numbers as primes
		boolean [] notPrime = new boolean[n];
		
		for (int i=2;i<n;i++) {
			
			if (!notPrime[i]) {
				count ++;
				
				for (int j=2;i*j<n;j++) {
					notPrime[i*j] = true;
				}				
			}			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// number upto which you want to count prime numbers
		int n = 12;
		System.out.println(countPrime(n));
	}

}
