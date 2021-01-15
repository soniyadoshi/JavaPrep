package Multidimension;
/*
2D Array - DS

Given a  2D Array, :
An hourglass in  is a subset of values with indices falling in this pattern in 's graphical representation:

-9 -9 -9  1 1 1
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0

 The  hourglass sums are:

-63, -34, -9, 12,
-10,   0, 28, 23,
-27, -11, -2, 10,
  9,  17, 25, 18
The highest hourglass sum is  from the hourglass beginning at row , column :
 */
public class HourGlassSumArray {

    public static void main(String args[]) {

    }

    static int hourglassSum(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        int max_hr_glass_sum = Integer.MIN_VALUE;

        for (int i=0; i< (rows - 2); i++) {
            for (int j=0; j< (cols - 2); j++) {
                int hr_glass_sum = 0;
                hr_glass_sum = hr_glass_sum + arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                max_hr_glass_sum = Math.max(hr_glass_sum, max_hr_glass_sum);
            }
        }

        return max_hr_glass_sum;

    }
}
