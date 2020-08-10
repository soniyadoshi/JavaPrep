package problemsolving;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class codingTest3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        solution("00:01:07,400-234-090\r\n" +
                "   00:05:01,701-080-080\r\n" +
                "   00:05:00,400-234-090");

    }

    public static void solution(String S) {
        // write your code in Java SE 8
        String[] lines = S.split(Character.toString((char)10));
        Map<String, Integer> allCalls = new HashMap<>();
        Map<String, Integer> secMap = new HashMap<>();
        Integer maxDur = 0;
        for (String line : lines) {
            String hrNum[] = line.split(",");
            String time = hrNum[0];
            String t[] = time.split(":");

            Integer hr = Integer.valueOf(t[0].trim());
            Integer min = Integer.valueOf(t[1].trim());
            Integer sec = Integer.valueOf(t[2].trim());

            Integer totMins = (hr*60)+min;
            if (totMins >= 5) {
                totMins = totMins+sec;
            }
            Integer totSecs = (min*60)+sec;

            String cell = hrNum[1].trim();
            if (allCalls.containsKey(cell)) {
                Integer mins = allCalls.get(cell);
                mins = mins + totMins;
                allCalls.put(cell, mins);
                Integer secs = secMap.get(cell);
                secs = secs + totSecs;
                secMap.put(cell, secs);
            } else {
                allCalls.put(cell, totMins);
                secMap.put(cell, totSecs);			}

        }
        int maxVal = 0;
        String maxKey = null;
        for(Map.Entry<String,Integer> m: allCalls.entrySet()) {
            if (m.getValue()> maxVal) {
                maxVal = m.getValue();
                maxKey = m.getKey();
            }
        }

        Integer totBill = 0;

        // calculate price
        for(Map.Entry<String, Integer> mp: allCalls.entrySet()) {
            if(mp.getValue() < 5) {
                totBill = totBill + secMap.get(mp.getKey())*3;
            } else if (!mp.getKey().equalsIgnoreCase(maxKey)) {
                totBill = totBill + (mp.getValue()*150);
            }
        }
        System.out.println("Bill :: " + totBill);
    }

    public static String[] seperate(String s) {
        String[] lines = s.split(Character.toString((char)10));
        return lines;
    }

    public static void mySol (String s) {
        String[] lines = s.split(Character.toString((char)10));
        Map<String, Integer> allCalls = new TreeMap<>();

        for (String line : lines) {
            String hrNum[] = line.split(",");
            String time = hrNum[0];
            String t[] = time.split(":");

            Integer hr = Integer.valueOf(t[0].trim());
            Integer min = Integer.valueOf(t[1].trim());
            Integer sec = Integer.valueOf(t[2].trim());

            Integer totMins = (hr*120)+(min*60)+sec;
            if (totMins >= 300) {
                totMins = totMins+sec;
            }

            String cell = hrNum[1].trim();
            if (allCalls.containsKey(cell)) {
                Integer mins = allCalls.get(cell);
                mins = mins + totMins;
                allCalls.put(cell, mins);
            } else {
                allCalls.put(cell, totMins);
            }

        }

        Integer totBill = 0;

        // calculate price
//         int mx = 0
//		for(Map.Entry<String, Integer> mp: allCalls.entrySet()) {
//			if(mp.getValue() < 300) {
//				totBill = totBill + allCalls.get(mp.getKey())*3;
//			} else if (!mp.getKey().equalsIgnoreCase(maxKey)) {
//				totBill = totBill + (mp.getValue()*150);
//			}
//		}
        System.out.println("Bill :: " + totBill);

    }
}
