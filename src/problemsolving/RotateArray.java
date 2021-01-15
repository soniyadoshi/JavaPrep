package problemsolving;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
 */
public class RotateArray {

    public static void main(String args[]) {

        int nums[] = {1,2,3,4,5,6,7};

        rotate(nums, 3);

        for (int i : nums) {
            System.out.println(i);
        }

    }
    public static void rotate(int[] nums, int k) {
        // this is required for case [-1] k = 2  i.e. when k is greater than array length;
        k %= nums.length;

        int n = nums.length;
        rotateArray(nums, 0, n-1);
        rotateArray(nums, k, n-1);
        rotateArray(nums, 0, k-1);
    }

    public static void rotateArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
