package devideandconquer;

/*
#Audible Jan 2021

 */
public class AlgoSwap {

    public static void main (String args[]) {

        int arr[] = {5, 1, 4, 2};
        /*
        Time Complexity: O(n log n), The algorithm used is divide and conquer,
        So in each level one full array traversal is needed and there are log n levels so the time complexity is O(n log n).
        Space Complexity: O(n), Temporary array
         */
        int i = numSwaps(arr);

        /*
        Time Complexity: O(n^2), Two nested loops are needed to traverse the array
        from start to end so the Time complexity is O(n^2)
        Space Complexity:O(1), No extra space is required.
         */
         i = numSwaps2(arr);
        System.out.println(" i -> " + i);
        for (int i1 : arr) {
            System.out.println(i1);
        }
    }

    public static int numSwaps2(int arr[]) {
        int cnt = 0;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int numSwaps (int arr[]) {
        int swaps = 0;
        int l = 0;
        int r = arr.length -1;
        swaps = divide(arr, l, r);

        return swaps;
    }

    public static int divide (int arr[], int l, int r) {
        int s = 0;
        int m = (l + r )/2;
        if (l < r) {
            s += divide(arr, l, m);
            s += divide(arr, m+1, r);
           s += swap(arr, l, m, r);
        }
        return s;
    }

    public static int swap (int arr[], int l, int m, int r) {
        int s = 0;
        int temp[] = new int [r - l + 1];
        int i= l;
        int j = m+1;
        int k = 0;

        while (i<=m && j<=r) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
                s++;
            }
            k++;
        }
        while (i <=m) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <=r) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (i=l; i<=r; i++) {
            arr[i] = temp[i-l];
        }
        return s;
    }


}
