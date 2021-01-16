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
		
		if (isColValid(board) && isRowValid(board) && IsQuadrValid(board)) {
			System.out.println("valid");
		} else {
			System.out.println("Not Valid");
		}
	}
	
	private static boolean isRowValid(int[][] board) {
		for (int i=0; i< board.length; i++) {
			Set<Integer> set = new HashSet<>();
			for (int j=0; j<board[0].length; j++) {
				if (!set.add(board[i][j])) {
					return false;
				}
			}
			System.out.println("row " + set.toString());
		}
		return true;
	}

	private static boolean isColValid(int[][] board) {
		for (int i=0; i< board.length; i++) {
			Set<Integer> set = new HashSet<>();
			for (int j=0; j<board[0].length; j++) {
				if (!set.add(board[j][i])) {
					return false;
				}
			}
			System.out.println("col " + set.toString());
		}
		return true;
	}
	
	private static boolean IsQuadrValid (int[][] board) {
	
		int i =0;
		
		while (i<board[0].length ) {
			int j = 0;
			while (j<board.length) {

				Set<Integer> set = new HashSet<>();

				for (int k = i; k < i + 2; k++) {
					for (int l = j; l < l + 2; l++) {
						if (!set.add(board[k][l])) {
							return false;
						}
					}
				}
				j = j + 2;
				System.out.println("q " + set.toString());
			}
			i = i+2;
		}
		return true;	
	}

}
