package stringmanipulation;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "stop";
		String anagram = "pots";
		
		for(Character c : word.toCharArray())
		{
			int index = anagram.indexOf(c);
			System.out.println("index"+index);
			if(index > -1)
			{
				System.out.println("&&&&"+anagram.substring(0,index));
				System.out.println("^^^"+anagram.substring(index+1));
				anagram = anagram.substring(0,index) + anagram.substring(index+1);
				System.out.println("**"+anagram);
				
			}
		}
		
		if(anagram.isEmpty())
		{
			System.out.println("anagram");
		}else {
			System.out.println("Not anagram");
		}

	}
	
	/* * Another way to check if two Strings are anagram or not in Java * This method assumes that both word and anagram are not null and lowercase * @return true, if both Strings are anagram. */ 
	
	public static boolean iAnagram(String word, String anagram)
	{ 
		char[] charFromWord = word.toCharArray(); 
		char[] charFromAnagram = anagram.toCharArray(); 
		Arrays.sort(charFromWord); 
		Arrays.sort(charFromAnagram); 
		return Arrays.equals(charFromWord, charFromAnagram); 
	}

	
	public static boolean checkAnagram(String first, String second)
	{ 
		char[] characters = first.toCharArray(); 
		StringBuilder sbSecond = new StringBuilder(second); 
		
		for(char ch : characters)
		{ 
			int index = sbSecond.indexOf("" + ch); 
			if(index != -1)
			{ 
				sbSecond.deleteCharAt(index); 
			}
			else{
				return false; 
				} 
			} return sbSecond.length()==0 ? true : false;
		}

	

}
