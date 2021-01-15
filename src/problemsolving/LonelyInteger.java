package problemsolving;

public class LonelyInteger {

    public static void main (String args[]) {
        int arr[] = {1,2,3,4,3,2,1};
        int t = lonelyInteger(arr);
        System.out.println(" *********** " + t);
    }

    public static int lonelyInteger(int [] array) {
        int val = 0;
        for (int num : array) {
            System.out.print(val);
            System.out.print(" ^ " + num);
            val = val ^ num; // ^ is XOR operator
            System.out.print(" = " + val);
            System.out.println("");
        }
        return val;
    }
}
