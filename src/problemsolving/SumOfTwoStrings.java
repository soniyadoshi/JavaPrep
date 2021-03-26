package problemsolving;

public class SumOfTwoStrings {

    public static void main(String args[]) {
        String result = sum("981", "99");
        System.out.println(result);
    }

    public static String sum( String n1, String n2) {

        int i1 = n1.length()-1;
        int i2 = n2.length()-1;

        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i1 >= 0 || i2 >= 0) {

            int num1 = i1 < 0 ? 0 : (n1.charAt(i1) - '0'); // n1, charAt(2) -> '1' , '1' - '0'
            int num2 = i2 < 0 ? 0 :  (n2.charAt(i2) - '0');

            int num = num1 + num2 + carry;


            if (num > 9 ) {
                num = num % 10;
                carry = 1;
            } else {
                carry = 0;
            }

            sb.append(num);

            i1--;
            i2--;

        }

        if (carry == 1) sb.append(1);
        return sb.reverse().toString();
    }
}
