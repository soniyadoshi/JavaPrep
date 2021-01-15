package problemsolving;

/*
Maximum Subarray
Given an integer array nums,
find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

 */
public class MaxSubArray {

    public static void main(String args[]) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int s = maxSubArray(nums);
        System.out.println("final  " + s);
    }

    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : nums) {
            sum += i;
            max = Math.max(max, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;

    }
}
