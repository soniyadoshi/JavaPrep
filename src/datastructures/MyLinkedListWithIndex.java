package datastructures;

public class MyLinkedListWithIndex {
	
	Node head;
	int listCount;
	
	public MyLinkedListWithIndex() {
		// TODO Auto-generated constructor stub
		head = new Node(0);
		listCount = 0;
	}
	
	public void add(int d)
	{
		Node newNode = new Node(d);
		Node current = head;
		
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = newNode;
		listCount++;
	}
	
	public void add(int d, int index)
	{
		if(index > listCount || index < 0)
		{
			System.out.println("index out of bound");
		}
		Node newNode = new Node(d);
		Node current = head;
		
		int jump =0;
		
		while(jump < index-1)
		{
			current = current.next;
			jump++;			
		}
		
		newNode.next = current.next;
		current.next = newNode;
		listCount++;
		
	}
	
	public boolean remove(int d)
	{
		Node delNode = new Node(d);
		Node current = head;
		
		while(current.next != null)
		{
			if(current.next.getData() == delNode.getData())
			{
				current.next = current.next.next;
				listCount--;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeAtIndex ( int index)
	{
		if(index >listCount || index < 0)
		{
			System.out.println("index out of bound");
		}
		
		
		Node current = head;
		
		int jump =0;
		while(jump < index-1)
		{
			current = current.next;
			jump++;
		}
		current.next=current.next.next;
		listCount--;
		return true;
		
	}
	
	public void show()
	{
		
	}
	
	private class Node{
		
		private Node next;
		private int data;
		
		public Node(int d) {
			// TODO Auto-generated constructor stub
			this.data = d;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
