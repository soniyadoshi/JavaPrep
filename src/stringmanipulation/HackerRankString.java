package stringmanipulation;

import java.util.Stack;

public class HackerRankString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(hackerrankInString("hereiamstackerrank"));
		System.out.println(hackerrankInString("rankhacker"));

	}
	
	 static String hackerrankInString(String s) {
	        // Complete this function
	        
	        String input ="hackerrank";
	        
	        if(s.length() < input.length())
	        {
	            return "NO";
	        }
//	        int j=0;
//	        for(int i=0; i<s.length();i++)
//	        {
//	            if(j<s.length() && s.charAt(i)== input.charAt(j))
//	            {
//	                j++;
//	            }
//	        }
//	        if(j==input.length())
//	        {
//	            return "YES";
//	        }else{
//	            return "NO";
//	        }
	        
	        String res ="NO";
	        
	        Stack<Character> stack = new Stack<>();
	        
	        stack.push('K');
	        stack.push('N');
	        stack.push('A');
	        stack.push('R');
	        stack.push('R');
	        stack.push('E');
	        stack.push('K');
	        stack.push('C');
	        stack.push('A');
	        stack.push('H');
	        
	        for(Character c: s.toCharArray())
	        {
	        	if(stack.peek() == c)
	        	{
	        		stack.pop();
	        	}
	        }
	        
	        if(stack.isEmpty())
	        {
	        	res="YES";
	        }
	        return res;
	    }


}
