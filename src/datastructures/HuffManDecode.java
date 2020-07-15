package datastructures;

public class HuffManDecode {
    static HNode hroot;

    public static void main(String args[]) {
        HuffManDecode d = new HuffManDecode();
        d.decode("ABACA", hroot);
    }
    void decode(String s, HNode root) {
        HNode d = root;
        StringBuilder sb = new StringBuilder();
        while (s.length() != 0) {
            if (s.charAt(0) == '1') {
                d = d.right;
                s = s.substring(1);
            } else {
                d = d.left;
                s = s.substring(1);
            }
            if (d.left == null && d.right == null) {
                sb.append(d.data);
                d = root;
            }
        }
        System.out.println(sb.toString());

    }
}

class HNode {
    public HNode left, right;
    public char data;
    public int frequency;
}
