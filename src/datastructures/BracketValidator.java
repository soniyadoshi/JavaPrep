package datastructures;

import java.util.Stack;

public class BracketValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BracketValidator validator = new BracketValidator();
		System.out.println(validator.validate("[a{}]{}[{[]()}]"));
		System.out.println(validator.validate("{[(])}"));
		System.out.println(validator.validate("{[}"));
	}
	
	/*
	 * { [ ] ( ) }" should return true
	 * { [ ( ] ) }" should return false
	 * "{ [ }" should return false
	 */
	private boolean validate(String brackets)
	{
		if(brackets == null || brackets == "")
		{
			return false;
		}
		
		Stack<Character> stack = new Stack<>();
		
		for(Character ch : brackets.toCharArray())
		{
			if(ch == '{' || ch == '[' || ch == '(')
			{
				stack.push(ch);
			}else if(ch == '}')
			{
				if(stack.peek() == '{')
				{
					stack.pop();
				}
			}else if(ch == ']')
			{
				if(stack.peek() == '[')
				{
					stack.pop();
				}
			}else if(ch == ')')
			{
				if(stack.peek() == '(')
				{
					stack.pop();
				}
			}
			
		}
		
		if(stack.isEmpty())
		{
			return true;
		}
		return false;
	}

}
