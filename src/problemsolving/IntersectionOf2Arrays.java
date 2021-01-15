package problemsolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given two arrays, write a function to compute their intersection.
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
 */
public class IntersectionOf2Arrays {

    public static void main (String args[]) {

        int arr1[] = {4,9,5};
        int arr2[] = {9,4,9,8,4};

        int res[] = findIntersection2(arr1, arr2);
        for (int i=0;  i<res.length; i++) {
            System.out.println(res[i]);
        }
    }

    /*
    this method keeps count of array elements from first array and
    second array uses the count to match the occurrence
     */
    public static int[] findIntersection(int arr1[], int arr2[]) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i=0; i<arr1.length; i++) {
            mp.put(arr1[i], mp.getOrDefault(arr1[i], 0) + 1);
        }
        int k = 0;
        for(int i=0; i<arr2.length; i++) {
            int cnt = mp.getOrDefault(arr2[i], 0);
            if (cnt > 0) {
                arr1[k] = arr2[i];
                k++;
                mp.put(arr1[i], cnt - 1);
            }
        }
        return Arrays.copyOfRange(arr1, 0, k);
    }

    /*
    using sort
     */
    public static int[] findIntersection2(int arr1[], int arr2[]) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0;
        int j=0;
        int k=0;
        while (i < arr1.length && j <arr2.length) {

            if (arr1[i] < arr2[j]) {
                i++;
            } else if(arr1[i] > arr2[j]) {
                j++;
            } else {
                arr1[k] = arr1[i];
                k++;
                i++;
            }
        }

        return Arrays.copyOfRange(arr1, 0, k);
    }
}
