package problemsolving;

public class RearrangeArray {

    public static void main(String args[]) {

        int nums[] = {3,2,5,6,8,1,7,11,10};
        int i =0;
        int j = nums.length-1;

        while (i < j) {
            if (nums[i] % 2 == 1) {
                i++;
            } else {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j--;
            }

        }
        for (int k: nums) {
            System.out.print(k + " ");
        }
    }
}
