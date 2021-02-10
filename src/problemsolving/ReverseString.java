package problemsolving;

public class ReverseString {
    public static void main(String args[]) {
        String s = "abcd";
        // O(n/2)
        // space complexity o(1)
        char c[] = s.toCharArray();
        int i = 0;
        int j = s.length()-1;

        while (i < j) {
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;
        }
        System.out.println(String.valueOf(c));
        // o(n)
        // space complexity 0(n) to keep recursion stack
        String t = reverse(s);
        System.out.println("**** " +t);

    }
    public static String reverse(String str) {
        if (str.length() == 0) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
