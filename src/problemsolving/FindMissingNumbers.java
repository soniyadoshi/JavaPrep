package problemsolving;

import java.util.*;

/*
Numeros the Artist had two lists that were permutations of one another.
He was very proud. Unfortunately, while transporting them from one exhibition to another,
some numbers were lost out of the first list. Can you find the missing numbers?

As an example, the array with some numbers missing, .
The original array of numbers . The numbers missing are .
 */

public class FindMissingNumbers {
    public static void main (String args[]) {
        int arr[] = {1, 4, 5, 7, 8};
        int brr[] = {1, 4, 4, 5, 7, 8, 8, 4};
//        findMissingNums(brr, arr);
//        missingNum(brr, arr);
        int res[] = missingNums(brr, arr);
        for (int i: res) {
            System.out.println(i);
        }
    }

    // this solution only works for ordered or sorted arrays in this problem numbers can be in any sequence
    public static int[] findMissingNums (int brr[], int arr[]) {
      if (brr.length == arr.length) {
          System.out.println(" no missing number");
      }
      int cnt = 0;
      int aPtr = 0;
      int bPtr = 0;
      Set<Integer> ls = new HashSet<>();
      while (cnt < arr.length) {
          cnt++;
          if (bPtr != brr.length && arr[aPtr] == brr[bPtr]) {
              aPtr++;
              bPtr++;
          } else {
              ls.add(arr[aPtr]);
              aPtr++;
          }
      }
      return ls.stream().mapToInt(Integer::intValue).toArray();
    }

    // xor only work for 1 missing number
    public static void missingNum (int arr[], int brr[]) {
        int res = 0;

        for (int i=0; i<arr.length; i++) {
            res = res ^ arr[i];
        }
        for (int i=0; i<brr.length; i++) {
            res = res ^ brr[i];
        }
        System.out.println("missing number is " + res);
    }

    public static int[] missingNums (int brr[], int arr[]) {

        Map<Integer, Integer> ArrMp = new HashMap<>();
        Map<Integer, Integer> BrrMp = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int i: arr) {
            if (ArrMp.containsKey(i)) {
                ArrMp.computeIfPresent(i, (k, v) -> v + 1);
            } else {
                ArrMp.put(i, 1);
            }
        }
        for (int i: brr) {
            if (BrrMp.containsKey(i)) {
                BrrMp.computeIfPresent(i, (k, v) -> v + 1);
            } else {
                BrrMp.put(i, 1);
            }
        }

        for(int k: BrrMp.keySet()) {
            if (!ArrMp.containsKey(k)) {
                res.add(k);
            } else {
                if (BrrMp.get(k) != ArrMp.get(k)) {
                    res.add(k);
                }
            }

        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
