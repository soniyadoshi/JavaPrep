package datastructures;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

/*
Given a list of pairs of equivalent words synonyms and a sentence text, Return all possible synonymous sentences sorted lexicographically.
 Input:
synonyms = [["happy","joy"],["sad","sorrow"],["joy","cheerful"]],
text = "I am happy today but was sad yesterday"
Output:
["I am cheerful today but was sad yesterday",
"I am cheerful today but was sorrow yesterday",
"I am happy today but was sad yesterday",
"I am happy today but was sorrow yesterday",
"I am joy today but was sad yesterday",
"I am joy today but was sorrow yesterday"]
 */

public class GenerateSentence {

    public static void main (String args[]) {

        List<List<String>> synonyms = new LinkedList<>();

        List<String> ls = new LinkedList<>();
        ls.add("happy");
        ls.add("joy");
        synonyms.add(ls);

        List<String> ls1 = new LinkedList<>();
        ls1.add("sad");
        ls1.add("sorrow");
        synonyms.add(ls1);

        List<String> ls2 = new LinkedList<>();
        ls2.add("joy");
        ls2.add("cheerful");
        synonyms.add(ls2);

        generateSentences(synonyms, "I am happy today but was sad yesterday");
    }

    public static List<String> generateSentences(List<List<String>> synonyms, String text) {

        String words[] = text.split(" ");

        // building structure
        Map<String, Set<String>> mp = new HashMap<>();

        for (String wrd : words) {
            for (List<String> ls : synonyms) {
                if (ls.contains(wrd)) {
                    if (!mp.containsKey(wrd)) {
                        mp.put(wrd, new HashSet<>());
                    }
                    Set<String> s = mp.get(wrd);
                    s.add(wrd);
                }
            }
        }

        for (List<String> ls : synonyms) {
            mp.keySet().forEach(k -> {
                Set<String> syns = mp.get(k);
                if (syns.contains(ls.get(0))) {
                    mp.get(k).add(ls.get(1));
                } else if (syns.contains(ls.get(1))) {
                    mp.get(k).add(ls.get(0));
                }
            });
        }

        ConcurrentSkipListSet<String> result = new ConcurrentSkipListSet<>();

        Set<String> prev = null;
        for (String k : mp.keySet()) {
            Set<String> st = mp.get(k);
            for (String s : st) {
                if (prev != null) {
                    for (String sen : result) {
                        String moreS = sen.replace(k, s);
                        result.add(moreS);
                    }
                }
                String sen = text.replace(k, s);
                result.add(sen);
            }
            prev = st;
        }

        LinkedList<String> resLs = new LinkedList<>(result);
        Collections.sort(resLs);
        System.out.println("-- > " + resLs);
        return resLs;
    }
}
