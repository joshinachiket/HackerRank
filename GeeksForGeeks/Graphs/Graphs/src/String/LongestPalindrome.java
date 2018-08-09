package String;

public class LongestPalindrome {
	
	public static int longestPalindrome (String s) {
		// upper triangular loop
		
		if (s == null) return 0;

		int n = s.length();
		int length = 0;
		int start = 0;
		int end = 0;
		
		// declare a n*n matrix		
		boolean [][] dp = new boolean [n][n];
		
		for (int len=0;len<n;len++) {
			
			for (int i=0;i<n-len;i++) {
				int j = len + i;
				// System.out.println("i:j " + i + ":" + j );
				
				// the value of len decides where in the diagonal alignment we are
				if (len == 0) {
					// this means a single letter is a palindrom
					dp[i][j] = true;
					length = j-i+1;
					start = i;
					end = j;
				} else if (len == 1 && s.charAt(i) == s.charAt(j)) {
					dp[i][j] = true;
					length = j-i+1;
					start = i;
					end = j;
				} else if ((len > 1) && (s.charAt(i) == s.charAt(j)) && (dp[i+1][j-1])) {
					dp[i][j] = true;
					length = j-i+1;
					start = i;
					end = j;
				}
			}
			
		}
		System.out.println("longest palindrom is: " +  s.substring(start, end+1));
		System.out.println("start:end " + start +":"+ end);
		return length;
	}
	
	public static void main(String[] args) {
		String str = "bbbab";
		int len = longestPalindrome (str);
		System.out.println("\n");
		System.out.println("the length of the longest palindrome of the string: " + str + " is: " + len);
	}
}


