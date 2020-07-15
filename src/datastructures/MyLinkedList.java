package datastructures;

public class MyLinkedList 
{
	private Node head;
	
	public MyLinkedList() {
		// TODO Auto-generated constructor stub
		head = new Node(0);
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
	}
	
	public void show()
	{
		Node current = head;
		
		while(current != null)
		{
			System.out.println( " data :: " + current.getData());
			current = current.next;
		}
		
	}
	
	public boolean remove(int d)
	{
		Node current = head;
		Node delNode = new Node(d);
		
		while(current.next != null)
		{
			if(delNode.getData() == current.next.getData())
			{
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	
	private class Node
	{
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
		@Override
		public String toString() {
			return "Node [next=" + next + ", data=" + data + "]";
		}		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList list = new MyLinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.toString());
		//list.show();
		
//		list.remove(2);
		
//		list.show();

	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

}
