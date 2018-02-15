package leetcode;

public class L657E_Judge_Route_Circle {
	
	public static boolean checkRotation (String moves) {
		
		int lrc = 0;
		int udc = 0;
		
		for (char c : moves.toCharArray()) {
			
			switch (c) {
				case 'U' : udc ++; break;
				case 'D' : udc--; break;
				case 'L' : lrc++; break;
				case 'R' : lrc --; break;
			}
		}
		
		return ( (udc == 0) && (lrc == 0));
	}
	
	
	public static void main(String[] args) {
		
		String moves = "ULRDUU";
		
		System.out.println(checkRotation(moves));
		
	
	}
}
