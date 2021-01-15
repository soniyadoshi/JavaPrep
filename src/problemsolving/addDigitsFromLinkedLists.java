package problemsolving;

import java.util.ArrayList;
import java.util.List;

/* leetCode
You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order, and each of their nodes contains a single digit.
 Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class addDigitsFromLinkedLists {

    public static void main (String args[]) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (int i=0; i<1; i++) {
            l1.add(9);
        }
        l2.add(1);
        for (int i=1; i<9; i++) {
            l2.add(9);
        }

        List<Integer> res = addListsInReverse(l1, l2);
        System.out.println("res :: " + res);
    }

    public static List<Integer> addListsInReverse (List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();

        Integer lNum1 = getNumberFromList(l1);
        System.out.println("lNum1 : " + lNum1);
        Integer lNum2 = getNumberFromList(l2);
        System.out.println("lNum2 : " + lNum2);

        Integer lnum3 = lNum1 + lNum2;
        System.out.println("lnum3 : " + lnum3);

        Integer rem = 0;

        while (lnum3 !=0) {
            rem = lnum3 % 10;
            result.add(rem);
            lnum3 = lnum3 / 10;
        }

        return result;
    }

    public static Integer getNumberFromList (List<Integer> l) {
        int num = 0;
        int x = 1;
        for (int i : l) {
            num = num + (i * x);
            x = x * 10;
        }
        return num;
    }
}
