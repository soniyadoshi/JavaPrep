package problemsolving;

import java.util.HashSet;
import java.util.Set;

/*
 * 1 2 3 4
 * 3 4 2 1
 * 2 1 3 4
 * 4 3 2 1
 */
public class SudokuBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int board[][] = {{1,2,3,4},
				        {3,4,2,1},
				        {2,1,3,4},
				        {4,3,2,1}};
		
		isBoardValid(board);
	}
	
	public static void isBoardValid (int[][] board) {
		
		int rowL = board[0].length;
		int colL = board.length;
		
		if (isRowColValid(rowL, colL, board) && isRowColValid(colL, rowL, board) && IsQuadrValid(board)) {
			System.out.println("valid");
		} else {
			System.out.println("Not Valid");
		}
	}
	
	private static boolean isRowColValid(int iLen, int jLen, int[][] board) {
		for (int i=0; i< iLen; i++) {
			Set<Integer> set = new HashSet<>();
			for (int j=0; j<jLen; j++) {
				if (!set.add(board[i][j])) {
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean IsQuadrValid (int[][] board) {
	
		int i =0;
		int j = 0;	
		
		while (i<board[0].length -1 && j<board.length-1) {
			Set<Integer> set = new HashSet<>();
			if(!set.add(board[i][j])
					|| !set.add(board[i+1][j])
					|| !set.add(board[i][j+1])
					|| !set.add(board[i+1][j+1])){
				return false;
			}
			i = i+2;
			j= j+2;
		}
		return true;	
	}

}
