package graphs;
// print all the solutions of a N queen
public class N_Queen {
	
	public static void display (char [][] board) {
		for (int i=0;i<board.length;i++) {
			for (int j=0;j<board.length;j++) {
				System.out.print(board[i][j] + " " );
			}
			System.out.println("\n");
		}
	}
	
	public static boolean validQPlace (char [][] board, int row, int col) {
		
		// four condition
		// 1. if (i - j) == (row - col) and i,j has a queen i.e. board[i][j] = 'O'
		// 2. if (i + j) == (row + col) and i,j has a queen i.e. board[i][j] = 'O'
		// 3. if i = x and i,j has a queen i.e. board[i][j] = 'O'
		// 4. if j = y and i,j has a queen i.e. board[i][j] = 'O'
		for (int i=0;i<board.length;i++) {
			for (int j=0;j<board.length;j++) {
				if (board[i][j]=='O' && ((row+col == i+j) || (row-col == i-j) || (i==row) || (j==col))) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean findOneNQueen (char [][] board, int col) {
		// exit condition
		// when your col i.e. your queen number to place is more than board,
		// that means we have reached a solution
		if (col == board.length) {
			// the current state of board has answer
			return true;
		}
		
		// else place this queen in the board
		// check a valid place in the current row from 0 to board.length
		for (int row = 0;row<board.length;row++) {
			
			if (validQPlace(board, row, col)) {
				// try placing queen here
				board[row][col] = 'O';
				// start DFS to know if this is correct
				if (findOneNQueen(board, col+1)) {
					return true;
				}
				// code reaching here means the place where we put the queen does not produce res
				// so we backtrack
				board[row][col] = '.';
			}
				
		}
		// code reaching here means we found no valid solution
		return false;

	}
	
	public static void main(String[] args) {
		int n = 5;
		
		// declare a board here
		char [][] board = new char [n][n];
		int row = board.length;
		
		for (int i=0;i<row;i++) {
			for (int j=0;j<row;j++) {
				board[i][j] = '.';
			}
		}
		
		if (findOneNQueen (board, 0)) {
			display(board);
		} else {
			System.out.println("NO SOLUTION");
		}
		
		
	}

}
