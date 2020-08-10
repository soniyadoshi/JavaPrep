package stringmanipulation;

import java.util.Stack;

public class ReduceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = super_reduced_string("aabcdcef");
		System.out.println(str);

	}
	
	static String super_reduced_string(String s){
        // Complete this function
        
        if(s == null || s == "")
        {
            return "";
        }
        Stack<Character> stack = new Stack();
        
        for(int i=0; i< s.length(); i++)
        {
            Character c = s.charAt(i);
            
            if(!stack.isEmpty() && c == stack.peek())
            {
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        
        if(stack.isEmpty())
        {
            return "";
        }else{
            return stack.toString();
        }
	}

}
