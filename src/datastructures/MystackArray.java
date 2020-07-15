package datastructures;

import java.util.Arrays;

public class MystackArray<E> {
	
	int size = 0;
	int DEFAULT_CAPACITY = 2;
    Object elements[];
    
    public MystackArray()
    {
    	elements = new Object[DEFAULT_CAPACITY];
    }
    
       
    public void push (E e)
    {
    	if(size == elements.length)
    	{
    		checkCapacity();
    	}
    	elements[size++] = e;    	
    }
    
    public E pop() 
    {
    	E e =(E) elements[--size];   
    	elements[size]= null;
    	return e;
    }
    
    public void checkCapacity()
    {
    	int newLength = elements.length * 2;
    	this.elements = Arrays.copyOf(elements, newLength);
    	System.out.println(elements.length);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MystackArray<Integer> stack = new MystackArray<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		while(stack.size != 0)
		{
			System.out.println(stack.pop());
		}

	}

}
