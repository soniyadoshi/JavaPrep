package problemsolving;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a m x n grid filled with non-negative numbers, 
 * find a path from top left to bottom right
 *  which minimizes the sum of all numbers along its path.
 *  Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
 */
public class MinPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {{1,3,1},
						{1,5,1},
						{4,2,1}};
		int i = maxPath(grid);
		System.out.println(i);

	}
	
    public static int minPathSum(int[][] grid) {
    	List<Integer> ls = new ArrayList<>();
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for(int i=1;i<grid[0].length;i++){
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }
        for(int i=1;i<grid.length;i++){
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
    
    public static int minPathS(int[][] grid) {
    	
    	for (int i=1; i<grid.length; i++) {
    		grid[0][i] = grid[0][i]+grid[0][i-1];
    	}
    	for (int j=1; j<grid[0].length; j++) {
    		grid[j][0] = grid[j][0]+grid[j-1][0];
    	}
    	for(int i=1; i<grid.length; i++) {
    		for (int j=1; j<grid[0].length; j++) {
    			grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1])+grid[i][j];
    		}
    	}
    	return grid[grid.length-1][grid[0].length-1];
    }
    
    /*
     * from left bottom to right corner
     * */
    public static int maxPath(int [][] grid) {
    	
    	for(int i = grid.length-2; i>=0; i--) {
    		grid[i][0] = grid[i][0]+grid[i+1][0];
    		System.out.println(" row **** " + grid[i][0]);
    	}
    	
    	for(int j=1; j<grid[0].length; j++) {
    		grid[grid.length-1][j] = grid[grid.length-1][j-1]+grid[grid.length-1][j];
    		System.out.println(" col **** " + grid[grid.length-1][j]);
    	}
    	
    	for(int i=grid.length-2; i>=0; i--) {
    		for(int j=1; j<grid[0].length; j++) {
    			grid[i][j] = Math.max(grid[i+1][j], grid[i][j-1])+grid[i][j];
    			System.out.println(" mid **** " + grid[i][j]);
    		}
    	}
    	return grid[0][grid[0].length-1];
    }

}
