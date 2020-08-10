package problemsolving;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//smallest int does not exist in array
		
		int array[] = {11,13,16,14,11,12}; //5
		
		System.out.println(solution(array));

	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
  
        int missingNum = 0;
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
            	missingNum = i;
            	return i;
            }
        }
     return missingNum;
    }

}
