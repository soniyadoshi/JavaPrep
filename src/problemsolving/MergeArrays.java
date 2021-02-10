package problemsolving;

/*
Merge 2 sorted arrays into 2 without using extra space
 */
public class MergeArrays {

    public static void main (String args[]) {

        int num1[] = {0, 2, 5, 8};
        int num2[] = {1, 6, 7};

        for (int i=0; i<num1.length; i++) {

            if (num1[i] > num2[0]) {
                int t = num1[i];
                num1[i] = num2[0];
                num2[0] = t;

                int first = num2[0];
                int k;

                for (k=1 ; k<num2.length && num2[k] < first; k++) {
                    num2[k-1] = num2[k];
                }
                num2[k-1] = first;
            }
        }

        for (int l : num1) {
            System.out.print(l + " ");
        }
        System.out.println();
        for (int l : num2) {
            System.out.print(l + " ");
        }

    }
}
