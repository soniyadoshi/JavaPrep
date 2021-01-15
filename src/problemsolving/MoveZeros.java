package problemsolving;

/*
Given an array nums,
write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
public class MoveZeros {

    public static void main(String args[]) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + ", ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                j++;
            }
        }
    }
}
