package problemsolving;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class RearrangeList {
    public static void main(String args[]) {
        List<Integer> ls = new LinkedList<>();

        //3,2,5,6,8,1,7,11,10
        ls.add(3);
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(8);
        ls.add(1);
        ls.add(7);
        ls.add(11);
        ls.add(10);

        int i=0;
        int j = ls.size()-1;

        // o(n)
        while (i<j) {
           if (ls.get(i) % 2 == 1 && ls.get(j) % 2 ==0) {
               int temp = ls.get(i);
               ls.set(i, ls.get(j));
               ls.set(j, temp);
           } else {
               i++;
           }
        }
        // O(nLogn)
        NumberComparator nm = new NumberComparator();
        Collections.sort(ls, nm);
        System.out.println(nm.swap);
        System.out.println(ls.toString());
    }
}

class NumberComparator implements Comparator<Integer> {

    int swap = 0;

    @Override
    public int compare(Integer t1, Integer t2) {

        if (t1%2 == 0 && t2%2 == 1) {
            swap++;
            return -1;
        }
        return 0;
    }
}
