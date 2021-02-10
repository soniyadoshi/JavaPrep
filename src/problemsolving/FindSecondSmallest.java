package problemsolving;

public class FindSecondSmallest {
    public static void main(String args[]) {
        int arr[] = {3,7,9,1,8};
        int sm = Integer.MAX_VALUE;
        int ssm = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < sm) {
                ssm = sm;
                sm = arr[i];
            }
        }
        System.out.println(ssm);
    }
}
