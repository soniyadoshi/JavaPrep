package datastructures;

public class DetectALoopInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DetectALoopInLinkedList list = new DetectALoopInLinkedList();
		Node head =list.new Node(3);
		head.next = list.new Node(4);
		head.next.next = head;
		
		System.out.println(list.detectLoop(head));

	}
	
	private boolean detectLoop(Node head)
	{
		if(head == null)
		{
			return false;
		}
		Node slw =head;
		Node fast = head;
		
		while(slw != null && fast != null && fast.next != null)
		{
			slw = slw.next;
			fast = fast.next.next;
			
			if(slw == fast)
			{
				return true;
			}
			
		}
		return false;
	}
	
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data = d;
			next = null;
		}
	}

}
