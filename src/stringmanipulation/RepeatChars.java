package stringmanipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcaded";
		
		Map<Character, Integer> repCount = new HashMap<>();
		
		
		for(int i=0; i<str.length();i++)
		{
			if(repCount.containsKey(str.charAt(i)))
			{
				Integer cnt = repCount.get(str.charAt(i));
				repCount.put(str.charAt(i), cnt+1);
				
			}else {
				repCount.put(str.charAt(i), 1);
			}
		}
		
		Set<Character> set = repCount.keySet();
		
		for(Character c: set)
		{
			System.out.println(c + " ::" +repCount.get(c));
		}

	}

}
