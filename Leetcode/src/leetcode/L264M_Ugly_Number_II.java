package leetcode;

public class L264M_Ugly_Number_II {
	
	// dynamic programming
	// https://leetcode.com/problems/ugly-number-ii/discuss/69362/O(n)-Java-solution
	// https://www.geeksforgeeks.org/ugly-numbers/
	
	// catch here is we go on constructing the ugly numbers till we get nth number
	
	public static int getNthUglyNumber(int n) {
		
		// declare array to store generated ugly number
		int index2=0, index3=0, index5=0;
		int fact2=2, fact3=3, fact5=5;
		
		// out of the three factors the lowest will go in the answer array
		// answer array will be equal in length of n
		
		int [] answer = new int[n];
		
		// 1 is always an ugly number and 1st ugly number
		answer[0] = 1;
		
		for (int i=1;i<n;i++) {
			
			// find the next smallest number in the series
			int ugly = Math.min(Math.min(fact2, fact3), fact5);
			answer[i] = ugly;
			
			if (fact2 == ugly) {
				fact2 = answer[++index2] * 2;
			}
			if (fact3 == ugly) {
				fact3 = answer[++index3] * 3;
			}
			if (fact5 == ugly) {
				fact5 = answer[++index5] * 5;
			}
		}
		return answer[n-1];
	}
	
	public static void main(String[] args) {
		// the nth ugly number
		int n = 10;
		System.out.println(getNthUglyNumber(n));
	}
}
