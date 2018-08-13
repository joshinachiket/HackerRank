package Practise;

public class Tower_Of_Hanoi {
	
	// move n disks from A to B by using C
	// three towers
	// A B C
	// A = Starting Rod
	// B = Auxillary Rod
	// C = Destination Rod
	public static void towerOfHanoi(int n, char start_rod, char fin_rod, char mid_rod) {
		if (n == 1) {
			System.out.println("Move disk 1 " + "from: " + start_rod + " to " + fin_rod);
			return;
		}
		

		// 2. for step 1 to happen, we have to move (n-1) disks from start to final using mid
		towerOfHanoi(n-1, start_rod, mid_rod, fin_rod);
		// after step 2 we move that nth disk here
		System.out.println("Move disk " + n +" from: " + start_rod + " to " + fin_rod);
		// 2. after we moved the nth disk now we move the (n-1) disks that are now in the mid
		// to final using start
		towerOfHanoi(n-1, mid_rod, fin_rod, start_rod);
	}
	
	public static void main(String[] args) {
		int n = 4; // number of disks
		char start_rod = 'A';
		char mid_rod = 'B';
		char fin_rod ='C';
		// start recursively solving puzzle 
		// simple 3 steps process
		// 1. we ahve to move n diskar from start to final using mid
		towerOfHanoi(n, start_rod, fin_rod, mid_rod);
	}

}
