package stringmanipulation;

import java.util.HashMap;
import java.util.Map;

public class SherlockValidString {
    public static void main(String args[]) {
//        String res = isValid("abcda");
        String res = valid("aabbcd");
        System.out.println(res);
    }
    static String valid (String t) {
        int cnt = 1;
        int a[] = new int[256];
        for (char c : t.toCharArray()) {
            a[c]++;
        }
        for (int i : a) {
            if (i != 0)
                System.out.println(i);
        }
        int f = 0;
        int val = 0;
        int resCnt = 0;
        for (int i : a) {
            if (i != 0 && f == 0) {
               val = i;
               f++;
            } else if (i != 0 && f !=0) {
                int diff = Math.abs(val - i);
                if (diff > 0) {
                    resCnt++;
                }
            }
        }
        return resCnt > 1 ? "NO" : "YES";
    }
    static String isValid(String s) {
        if (s.length() == 1) {
            return "YES";
        }
        Map<Character, Integer> mp = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }
        int pVal = 0;
        int ctr = 0;
        int delCtr = 0;
        for(Map.Entry<Character, Integer> entry: mp.entrySet()) {
            ctr++;
            if (ctr == 1) {
                pVal = entry.getValue();
            } else {
                int diff = Math.abs(pVal - entry.getValue());
                if (diff > 0) {
                    delCtr++;
                }
            }
        }
        return delCtr > 1 ? "NO" : "YES";
    }
}
