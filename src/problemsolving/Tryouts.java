package problemsolving;

public class Tryouts {

    public static void main (String args[]) {
        /*int sum = 0;
        String bin = "1";

        String s = "abc";


        System.out.println(s.substring(3));
        */

//        Tryouts t = new Tryouts();
//        for(int i=0;i<12;i++) {
//            System.out.println(t.fib(i));
//        }

//        String t = "abs";
//
//        for (int i=0; i<t.length(); i++) {
//            char c = t.charAt(i);
//            System.out.println(c);
//            System.out.println(c + i);
//            System.out.println(c += c);
//        }
        char arr[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char c = '3';
        int i = 0;
        char t =(char) i;
        System.out.println(i);

    }
//1 1 2 3 5 8 13 21
    public int fib(int n){
        if(n==0) return 0;
        if ( n==1 || n ==2) return 1;
        return fib(n-1) + fib(n-2);
    }



//        for (int i=0; i<s.length(); i++) {
//            int in = s.charAt(i) - 'a';
//
//            System.out.println(in);
//        }

//        sum = Integer.parseInt("1", 2)
//                + Integer.parseInt("0", 2)
//                + Integer.parseInt("0", 2)
//                + Integer.parseInt("1", 2)
//                + Integer.parseInt("0", 2)
//                + Integer.parseInt("1", 2)
//
//                + Integer.parseInt("1", 2)
//                + Integer.parseInt("1", 2)
//                + Integer.parseInt("0", 2)
//                + Integer.parseInt("1", 2)
//                + Integer.parseInt("1", 2)
//                + Integer.parseInt("1", 2);
//
//        System.out.println(Integer.parseInt("1", 2));
//        System.out.println(Integer.parseInt("10", 2));
//        System.out.println(Integer.parseInt("0", 2));
//        System.out.println(Integer.parseInt("1", 2));
//        System.out.println(Integer.parseInt("0", 2));
//        System.out.println(Integer.parseInt("1", 2));
//        System.out.println(Integer.parseInt("1", 2));
//        System.out.println(Integer.parseInt("1", 2));
//        System.out.println(Integer.parseInt("0", 2));
//        System.out.println(Integer.parseInt("1", 2));
//        System.out.println(Integer.parseInt("1", 2));
//        System.out.println(Integer.parseInt("1", 2));
//        System.out.println("-- > " + sum);


}
