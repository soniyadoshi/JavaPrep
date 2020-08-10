package problemsolving;

import java.util.Arrays;
import java.util.List;

public class DuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = Arrays.asList(3,4,2,3,1,5);
		for (Integer i : l1) {
			if (i.equals(l1.indexOf(i))) {
				System.out.println("duplicate found " + i);
			}
		}
	}

}
