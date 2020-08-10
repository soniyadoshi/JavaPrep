package stringmanipulation;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "acadb";
		String reverse = "";
		reverseString(str.toCharArray());
		
//		StringBuilder str1 = new StringBuilder(str).reverse();
//		System.out.println(str1.toString());
		
//		for(int i=str.length()-1; i>=0; i--)
//		{
//			reverse = reverse + str.charAt(i);
//		}
//		
//		if(str.equals(reverse))
//		{
//			System.out.println("palindrome");
//		}
//		
//		System.out.println(reverse);
		
//		reverseUsingStack(str);
		

	}
	
	public static void reverseUsingStack(String str)
	{
		Stack<Character> stack = new Stack<>();
		
		for(int i= 0; i<str.length(); i++)
		{
			stack.push(str.charAt(i));
		}
		String rev ="";
		for(int i=0; i<str.length(); i++)
		{
			char c = stack.pop();
			rev = rev+c;
		}
		System.out.println(rev);
		
	}
	
	 public static void reverseString(char[] s) {
		 int j=s.length-1;
		 int size = s.length/2;
	        for (int i=0; i<=size; i++) {
	        	System.out.println(" i :: " + s[i]);
	        	System.out.println(" j :: " + s[j]);
	            char temp = s[j];
	                s[j] = s[i];
	                s[i] = temp;
	                j--;
	        }
	        System.out.println(s);
	    }

}
