package problemsolving;

import java.util.HashSet;
import java.util.Set;

// count the pair of socks, number representing colors
public class PairOfSocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar [] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int out = sockMerchant(ar.length, ar);
		System.out.println(out);

	}
	 static int sockMerchant(int n, int[] ar) {
	       Set<Integer> colors = new HashSet<>();
	       int pairCount = 0;
	      for (int i : ar ) {
	    	  if (!colors.add(i)) {
	    		  pairCount++;
	    		  colors.remove(i);
	    	  } 
	      }
	      return pairCount;
	    }

}
