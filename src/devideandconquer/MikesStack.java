package devideandconquer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
3
6
3 4 5 1 1 2
10
3 2 9 5 2 9 4 14 7 10
8
14 5 13 19 17 10 18 12

Output:
3 1 1 2
5 2 2 4 7 10
4 5 10 12 18
 */
public class MikesStack {
    public static void main(String args[]) {
//        int arr[] = {14, 5, 13, 19, 17, 10, 18, 12};
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int i=1; i<=T; i++) {
            int N = in.nextInt();
            int arr[] = new int[N];
            for (int j=0; j<N; j++) {
                arr[j] = in.nextInt();
            }
            compostStackAlgo(arr);
        }
    }

    public static void compostStackAlgo(int arr[]) {
        List<Stack<Integer>> ls = new LinkedList<>();
        for (int i = 0; i<arr.length; i++) {
            if (i == 0) {
                Stack<Integer> st = new Stack<>();
                st.push(arr[i]);
                ls.add(st);
            } else {
                checkValidStack(arr[i], ls);
            }
        }
        System.out.println("number of stacks :: " + ls.size());
        for (Stack<Integer> st : ls) {
            System.out.println(" top of stacks :: " + st.peek());
        }
    }

    public static void checkValidStack(int num, List<Stack<Integer>> ls) {
            int small = Integer.MAX_VALUE;
            int si = -1;
        for(int i =0; i<ls.size(); i++) {
            Stack<Integer> st = ls.get(i);
            if (st.peek() > num && st.peek() < small) {
                small = st.peek();
                si = i;
            }
        }
        if (si != -1) {
            ls.get(si).push(num);
        } else {
            Stack<Integer> st = new Stack();
            st.push(num);
            ls.add(st);
        }


    }
}
