package problemsolving;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Given an int array nums and an int target. Find two integers in nums such that the sum is closest to target.
Input: nums = [1, 2, 3, 4, 5], target = 10
Output: [4, 5]

Input: nums= [-1, 2, 1, -4], target = 4
Output: [2, 1]
 */
public class ClosestSumOf2 {
    public static void main (String args[]) {

        int nums[] = {-1, 2, 1, -4};
        //-4, -1, 1, 2
        int t = 4;
        int arr[] = new int[2];

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        int closest = Integer.MIN_VALUE;


        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum < t) {
                if (sum > closest) {
                    closest = sum;
                    arr[0] = nums[i];
                    arr[1] = nums[j];
                }
                i++;
            } else {
                j--;
            }
        }
        System.out.println(arr[0] + " " + arr[1]);
    }
}
