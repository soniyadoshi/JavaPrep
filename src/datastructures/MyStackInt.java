package datastructures;

public class MyStackInt {
	
	int MAX = 10;
	int elements[] = new int [MAX];
	int top =-1;
	
	public boolean isEmpty()
	{
		return (top < 0);
	}
	
	public boolean push(int x)
	{
		if(top > MAX)
		{
			System.out.println("Stack overflow");
			return false;
		}else {
			elements[++top] = x;
			return true;
		}		
	}
	
	public int pop()
	{
		if(top < 0)
		{
			System.out.println("Stack underflow");
			return 0;
		}else {
			int x = elements[top--];
			return x;
		}
		
	}
	
	public int peek()
	{
		return elements[top];
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStackInt stack = new MyStackInt();
		
		stack.push(2);
		stack.push(3);
		stack.push(5);
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}

	}

}
