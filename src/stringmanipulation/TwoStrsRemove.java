package stringmanipulation;

import java.util.LinkedList;
import java.util.List;

public class TwoStrsRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeStr1("Hello there","el");

	}
	
	public static void removeStr1(String str1, String str2) {
		
		List<Character> ls1 = new LinkedList<>();
		List<Character> ls2 = new LinkedList<>();
				
		
		for(Character c: str1.toCharArray())
		{
			ls1.add(c);
		}
		
		for(Character c: str2.toCharArray())
		{
			ls2.add(c);
		}
		
		ls1.removeAll(ls2);
		
		System.out.println(ls1.toString());
		
		
	}

}
