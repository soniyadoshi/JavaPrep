package devideandconquer;

public class MergeSort {
    public static void main (String args[]) {
        int arr[] = {11, 4, 3,};
        mergeSort(arr);
    }

    public static void mergeSort (int arr[]) {
        int l = 0;
        int r = arr.length - 1;
        int sorted[] = devide (arr, l, r);
        for (int i : sorted) {
            System.out.println(i);
        }
    }

    public static int[] devide (int arr[], int l, int r) {
        if (l < r) {
            int mid  = (l + r) / 2;
            devide (arr, l, mid);
            devide (arr, mid + 1, r);
            combine(arr, l, mid, r);
        }
        return arr;
    }

    public static int[] combine (int arr[], int l, int m, int r) {
        System.out.println(l + " " + m + " " +  r);
        int temp[] = new int[r - l + 1];

        int i = l;
        int j = m+1;
        int k =0;

        while (i<=m && j <=r) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= m) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= r) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (i=l; i<=r; i++) {
            arr[i] = temp[i-l];
        }
        return arr;
    }
}
