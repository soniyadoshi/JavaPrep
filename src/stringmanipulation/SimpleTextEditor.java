package stringmanipulation;

/*
In this challenge, you must implement a simple text editor. Initially, your editor contains an empty string, . You must perform  operations of the following  types:

append - Append string  to the end of .
delete - Delete the last  characters of .
print - Print the  character of .
undo - Undo the last (not previously undone) operation of type  or , reverting  to the state it was in prior to that operation.
 */


import java.util.Stack;

public class SimpleTextEditor {

    public static void main (String args) {
        
        Stack<String> stack = new Stack();
    }

    public static void append (String text, String s) {

        StringBuilder builder = new StringBuilder(s);
        builder.append(text);
        s = builder.toString();
    }

    public static void delete (String s, int k) {
        s = s.substring(k);
    }

    public static void print (String s, int k) {
        System.out.println(s.charAt(k));
    }

    public static void undo () {

    }
}
