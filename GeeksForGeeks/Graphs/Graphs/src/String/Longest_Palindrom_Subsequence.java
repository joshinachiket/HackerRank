package String;

public class Longest_Palindrom_Subsequence {

	public static int longestPalindrome (String s) {
		if (s == null) return 0;
		int n = s.length();
		int dp [][] = new int [n][n];
		
		// upper triangular matrix loop
		for (int len=0;len<n;len++) {
			for (int i=0;i<n-len;i++) {
				int j = len + i;
				// System.out.println("i:j " + i +":" + j);
				
				if (len == 0) {
					dp[i][j] = 1;
				} else if (len == 1 && s.charAt(i) == s.charAt(j)) {
					dp[i][j] = 2;
				} else if (s.charAt(i) == s.charAt(j)) {
					dp[i][j] = dp[i+1][j-1] + 2;
				} else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
				}
				System.out.print(dp[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		return dp[0][n-1];
	}
	public static void main(String[] args) {
		String s = "bbbab";
		int len = longestPalindrome(s);
		System.out.println("The length of longest palindrome subsequence is: " + len);
	}
}
