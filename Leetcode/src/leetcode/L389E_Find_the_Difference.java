package leetcode;

public class L389E_Find_the_Difference {
	
	public static char findDifference (String s, String t) {
		
		char [] ch1 = s.toCharArray();
		char [] ch2 = t.toCharArray();
		
		int sums = 0;
		int sumt = 0;
		
		for (int i=0;i<s.length();i++) {
			sums += ch1[i];
		}
		
		for (int i=0;i<t.length();i++) {
			sumt += ch2[i];
		}
		// System.out.println("sums: " + sums);
		// System.out.println("sumt: " + sumt);
		return (char)(sumt-sums);
	}
	
	public static void main(String[] args) {
		// strings that we have to compare
		String s = "abnms";
		String t = "abnmst";
		System.out.println(findDifference(s, t));
		
	}

}
