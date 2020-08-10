package datastructures;

public class SinglyLinkedList<T> {
	
	Node head;
	
	public void append(T data)
	{
		if(head == null)
		{
			head = new Node(data);
			return;
		}
		
		tail().next = new Node(data);
	}
	
	public Node tail()
	{
		Node tail = head;
		
		while(tail.next != null)
		{
			tail = tail.next;
		}
		
		return tail;
		
	}
	
	public int length()
	{
		int count = 0;
		Node current = head;
		
		while(current != null)
		{
			count++;
			current = current.next;
			
		}
		
		return count;
	}
	
	public int findMidEleOnePass()
	{
		Node current = this.head;
		Node mid = this.head;
		int count = 1;
		
		while(current.next != null)
		{			
			count++;
			if(count % 2 == 0)
			{
				mid = current.next;
			}
			current = current.next;
		}	
				
		System.out.println("mid "+count+"  "+mid);
		
		return count;
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		Node current = head;
		
		
		
		while(current != null)
		{
			sb.append(current);
			sb.append("****");
			current = current.next;			
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		
		list.append("java");
		list.append("jeee");
		list.append("android");
		//list.append("scala");
		
		int count = list.findMidEleOnePass();
		System.out.println("mid" + count);
		
		System.out.println(list.toString());
		
		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
		
		list2.append(2024);
		list2.append(3045);
		
		System.out.println(list2.toString());

	}
	
	
	private class Node{
		Node next;
		T data;
		
		public Node(T data)
		{
			this.data = data;
		}

		@Override
		public String toString() {
			return data.toString();
		}
		
		
	}

}
