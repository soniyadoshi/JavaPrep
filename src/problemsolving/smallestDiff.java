package problemsolving;

/*
* Find the two elements that have the smallest difference in a given array
* */

public class smallestDiff {
    public static void main(String args[]) {
        int arr[] = {2, 12, 4, 6, 8, 7};
        int k = findSmallest(arr);
        System.out.println(k);
    }

    public static int findSmallest(int arr[]) {
        int res = Integer.MAX_VALUE;
        int a = arr[0];

        for (int i=1; i<arr.length; i++) {
            int diff = Math.abs(a - arr[i]);
            System.out.println("diff " + diff);
            if (diff < res) {
                res = diff;
            }
            a = arr[i];
        }

        return res;
    }
}
