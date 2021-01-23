package problemsolving;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main (String args[]) {
        int i = romanToInt("IX");
        System.out.println("i ** " + i);
    }

    public static int romanToInt(String s) {
        int num = 0;
        int prev = 0;
        Character c = 'Z';

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i=0; i<s.length(); i++) {

            int temp = map.get(s.charAt(i));

            if (s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') {

                if ((c == 'I' && s.charAt(i) == 'X')
                        || (c == 'X' && s.charAt(i) == 'C')) {

                    num = num - prev;
                    temp = map.get(s.charAt(i)) - prev;
                    num += temp;
                    prev = 0;
                    c = 'Z';

                } else {
                    prev = temp;
                    c = s.charAt(i);
                    num += temp;
                }

            } else if ((c == 'I' && (s.charAt(i) == 'V' || s.charAt(i) == 'X'))
                    || (c == 'X' && (s.charAt(i) == 'L' || s.charAt(i) == 'C'))
                    || (c == 'C' && (s.charAt(i) == 'D' || s.charAt(i) == 'M'))) {


                num = num - prev;
                temp = map.get(s.charAt(i)) - prev;
                num += temp;
                prev = 0;
                c = 'Z';

            } else {
                num += temp;
            }
        }

        return num;
    }
}
