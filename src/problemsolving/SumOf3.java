package problemsolving;

import java.util.*;

public class SumOf3 {
    public static void main (String args[]) {

        int[] nums = {-1,0,1,2,-1,-4};

        Arrays.sort(nums);

        List<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i< nums.length; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                int s = 0 - nums[i];

                Set<Integer> set = new HashSet<>();

                for (int j=i+1; j<nums.length; j++) {

                    int t = s - nums[j];
                    if (!set.contains(t)) {
                        set.add(nums[j]);
                    } else {
                        List<Integer> l = new ArrayList();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(t);
                        ls.add(l);
                    }
                }
            }
        }


        System.out.println(ls.toString());
    }
}
