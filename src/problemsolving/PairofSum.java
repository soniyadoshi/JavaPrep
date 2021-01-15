package problemsolving;

import java.util.HashMap;
import java.util.Map;

public class PairofSum {
	 private static final int MAX = 100000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int A[] = {5, 4, 2, 6, 3, 7, 1};
	        int n = 8;
	        printpairs(A,  n);
	        int d[] = {-3,4,3,90};
        int a[] = twoSum(d, 0);
        System.out.println(a);
	}
	
	static void printpairs(int arr[],int sum)
    {
		
        // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];
 
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
 
            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            binmap[arr[i]] = true;
        }
    }

    /*
    Given an array of integers nums and and integer target,
    return the indices of the two numbers such that they add up to target.
    * */
    static int[] twoSum(int nums[],int target)
    {

        int result[] = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            Integer temp = target - nums[i];

            if (mp.containsKey(temp)) {
                result[0] = mp.get(temp);
                result[1] = i;
            } else {
                mp.put(nums[i], i);
            }
        }
        return result;
    }

}
