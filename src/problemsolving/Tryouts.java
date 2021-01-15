package problemsolving;

public class Tryouts {

    public static void main (String args[]) {
        int sum = 0;
        String bin = "1";

        sum = Integer.parseInt("1", 2)
                + Integer.parseInt("0", 2)
                + Integer.parseInt("0", 2)
                + Integer.parseInt("1", 2)
                + Integer.parseInt("0", 2)
                + Integer.parseInt("1", 2)

                + Integer.parseInt("1", 2)
                + Integer.parseInt("1", 2)
                + Integer.parseInt("0", 2)
                + Integer.parseInt("1", 2)
                + Integer.parseInt("1", 2)
                + Integer.parseInt("1", 2);

        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("10", 2));
        System.out.println(Integer.parseInt("0", 2));
        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("0", 2));
        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("0", 2));
        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("1", 2));
        System.out.println("-- > " + sum);

    }
}
