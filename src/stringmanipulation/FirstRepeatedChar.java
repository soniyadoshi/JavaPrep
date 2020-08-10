package stringmanipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//in a given string find first repeated char
public class FirstRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "abckas";
		//char cr = firstRepeatingChar(input);
		//System.out.println(cr);
		
		char cr = firstNonRepeatingChar(input);
		System.out.println(cr);

	}
	
	/*
	 * given a string find first repeating char
	 */
	public static char firstRepeatingChar(String input)
	{
		Set<Character> chars = null;
		char cr = 0;
		if(input != null)
		{
			chars = new HashSet<>();
		  for(int i=0; i<input.length(); i++)
		  {
			 cr = input.charAt(i);
			 if(!chars.add(cr))
			 {
				 return cr;
			 }
		  }
		}
		
		return cr;
	}
	
	/*
	 * given a string find first non repeating char
	 */
	public static char firstNonRepeatingChar(String input)
	{
		Map<Character, Integer> countMap= null;
		char cr = 0;
		
		if(input != null)
		{
			countMap = new HashMap<>();
			
			for(int i =0; i<input.length(); i++)
			{
				int count = 1;
				if(countMap.containsKey(input.charAt(i)))
				{
					Integer cnt = countMap.get(input.charAt(i));
					countMap.put(input.charAt(i), ++cnt);
					
				}else {
					countMap.put(input.charAt(i), count);
				}
			}
			
			for(int i=0; i<input.length(); i++)
			{
				if(countMap.get(input.charAt(i)) == 1)
				{
					cr = input.charAt(i);
					return cr;
				}
			}
			
		}
		return cr;
	}
	
	
	/*
	 * given a string and k find kth non repeating char
	 */
//	public static char findKthNonRepeatingChar(String input, int k)
//	{
//
//	}

}
