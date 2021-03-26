package problemsolving;

import java.util.HashMap;
import java.util.Map;

public class TrieTreeWithMap {
    TrieNd root;

    TrieTreeWithMap() {
        root = new TrieNd();
    }

    public void addWord (String word) {
        TrieNd cur = root;

        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);

            if (! cur.children.containsKey(c)) {
                cur.children.put(c, new TrieNd());
            }
            cur = cur.children.get(c);
        }
        cur.isWord = true;
    }

    public boolean search (String word) {

        TrieNd curr = root;
        for (int i=0; i<word.length(); i++) {

            char c = word.charAt(i);

            if (!curr.children.containsKey(c)) {
                if (c == '.') {
                    search(word.substring(i+1));
                } else {
                    return false;
                }
            }
            curr = curr.children.get(c);

        }
        return true;
    }
}
class TrieNd {
    Map<Character, TrieNd> children = new HashMap<>();
    boolean isWord = false;
}
