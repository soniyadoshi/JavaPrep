package datastructures;

public class TrieTree {


    //create dummy node

    TrieNode root;

    public TrieTree() {
        this.root = new TrieNode('\0');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {

        TrieNode curr = root;

        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);

            if (curr.children[c-'a'] == null) {
                curr.children[c-'a'] = new TrieNode(c);
            }
            curr = curr.children[c-'a'];
        }
        curr.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

        TrieNode nd = getNode(word);
        return nd != null && nd.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {

        TrieNode nd = getNode(prefix);
        return nd != null;
    }

    public TrieNode getNode (String word) {

        TrieNode curr = root;

        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c-'a'] == null) {
                return null;
            }
            curr = curr.children[c-'a'];
        }
        return curr;
    }
}

class TrieNode {
    // its tree of characters
    char c;

    // to mark it is a word, we will mark it when word ends
    boolean isWord;

    //each node will have possible 26 childrens
    TrieNode children[];

    public TrieNode(char c) {
        this.c = c;
        isWord = false;
        children = new TrieNode[26];
    }


}
