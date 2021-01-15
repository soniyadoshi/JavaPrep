package problemsolving;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {

    public static void main(String args[]) {
        int arr[] = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        int res = firstRecChar(arr);
        System.out.println(res);
    }

    public static int firstRecChar (int arr[]) {
        Set<Integer> set = new HashSet<>();
        for (int i: arr) {
            if (!set.add(i)) {
                return i;
            }
        }
        return 0;
    }
}
