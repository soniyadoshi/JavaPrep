package problemsolving;
/*
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Input: digits = [1,2,3]
Output: [1,2,4]

 */
public class PlusOne {

    public static void main(String args[]) {
        int arr[] = {1,2,3};
        int res[] = plusOne(arr);
        System.out.println(res);
    }

    public static int[] plusOne(int[] arr) {

        for (int i = arr.length -1 ; i > 0 ; i--) {
            if (arr[i] == 9) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i]++;
                return arr;
            }
        }
        arr = new int [arr.length + 1];
        arr[0] = 1;
        return arr;
    }
}
