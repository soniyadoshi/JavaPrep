package datastructures;

public class MyQueue {
	private int MAX_SIZE =10;
	private int elememnts[];
	
	private int front,rear,totalElemnts= -1;
	
	
	public MyQueue() {
		// TODO Auto-generated constructor stub
		elememnts = new int[MAX_SIZE];
		front = 0;
		rear =0;
		totalElemnts=0;
	}
	
	public void insert(int element)
	{
		if(totalElemnts == MAX_SIZE-1)
		{
			System.out.println("No space to enqueue");
		}
		
		elememnts[rear] = element;
		rear++;
		totalElemnts++;
	}
	
	public int remove()
	{
		if(totalElemnts <= 0)
		{
			System.out.println("queue is empty");
			return -1;
		}
		
		int ele = elememnts[front];
		front++;
		totalElemnts--;
		
		return ele;
	}
	
	public void show()
	{
		for(int i=0; i<totalElemnts; i++)
		{
			System.out.println(elememnts[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueue que = new MyQueue();
		que.insert(1);
//		que.insert(12);
//		que.insert(10);
//		que.insert(15);
		
		System.out.println("all elements");
		que.show();
		
		que.remove();
//		que.remove();
//		que.remove();
//		que.remove();
//		que.remove();
		
		System.out.println("after remoaval");
		que.show();

	}

}
