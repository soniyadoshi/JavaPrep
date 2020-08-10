package stringmanipulation;

import java.util.HashSet;
import java.util.Set;

/*
 * Print duplicate Characters from String
 */
public class DupFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "abcdaeebbg";
		Set<Character> result = new HashSet<>();
		
		for (Character chr : input.toCharArray()) {
			if (!result.add(chr)) {
				System.out.println(chr);
			}
		}
	}

}
