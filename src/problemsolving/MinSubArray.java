package problemsolving;

/*
 * Given an array of n positive integers and a positive integer s, 
 * find the minimal length of a contiguous subarray of which the sum ≥ s. 
 * If there isn't one, return 0 instead.
 */
public class MinSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(7, nums));

	}
	
	public static int minSubArrayLen(int s, int[] a) {
		  if (a == null || a.length == 0)
		    return 0;
		  
		  int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
		  
		  while (j < a.length) {
		    sum += a[j++];
		    
		    while (sum >= s) {
		      min = Math.min(min, j - i);
		      sum -= a[i++];
		    }
		  }
		  
		  return min == Integer.MAX_VALUE ? 0 : min;
		}

}
