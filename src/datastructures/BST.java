package datastructures;

public class BST {
	
	Node root;
	
	public void insert(int d)
	{
		Node newNode = new Node(d);
		
		if(root == null)
		{
			root = newNode;
			return;
		}
		Node current = root;
		
		while(true)
		{
			Node parent = current;
			
			if(d < current.data)
			{
				current = current.left;
				if(current == null)
				{
					parent.left = newNode;
					return;
				}
				
			}else {
				current = current.right;
				if(current == null)
				{
					parent.right = newNode;
					return;
				}
			}
		}		
	}
	
	public Node insertRec(Node curr,int d)
	{
		if(curr == null)
		{
			curr = new Node(d);
			return curr;
		}
		if(d < curr.data)
		{
			curr.left = insertRec(curr.left,d);
		}else {
			curr.right = insertRec(curr.right,d);
		}
		return curr;
	}
	
	public Node search(int d)
	{
		if(root == null)
		{
			return root;
		}
		
		Node current = root;
		
		while(current != null)
		{
			if(d == current.data)
			{
				return current;
			}
			if(d <current.data)
			{
				current = current.left;
				
			}else {
				current = current.right;
			}			
			
		}
	
		return null;
	}
	
	public Node searchRec(int d, Node node)
	{
		if(node == null)
		{
			return node;
		}
		Node current = node;
		
		if(d == current.data)
		{
			return current;
		}
		
		if(d < current.data)
		{
			return searchRec(d, current.left);
		}else {
			return searchRec(d, current.right);
		}
		
	}
	
	public boolean coantains(int d)
	{
		if(root == null)
		{
			return false;
		}
		Node current = root;
		
		while(current != null)
		{
			if(d == current.data)
			{
				return true;
			}
			if(d < current.data)
			{
				current = current.left;
			}else {
				current = current.right;
			}
		}
		return false;
	}
	
	public void inOrderDispaly()
	{
		Node current = root;
		displayIn(current);
	
	}
	
	public void display()
	{
		Node current = root;
		System.out.println(current);
	}
	
	private void displayIn(Node d)
	{
		if(d != null)
		{
		
		displayIn(d.left);
		System.out.println(d.data);
		displayIn(d.right);
		}
	}
	
	public void preOrderDisplay(Node d)
	{
		if(d != null)
		{
		System.out.println(d.data);
		displayIn(d.left);
		displayIn(d.right);
		}
	}
	
	public void postOrderDisplay(Node d)
	{
		if(d != null)
		{
		
		displayIn(d.left);
		displayIn(d.right);
		System.out.println(d.data);
		}
	}
	
	public boolean delete(int d)
	{
		Node current = root;
		Node parent = root;
		boolean isLeftChild = false;
		
		
		while(current.data != d)
		{
			parent = current;
			
			if(d < current.data)
			{
				current = current.left;
				isLeftChild = true;
					
			}else {
				current = current.right;
				isLeftChild = false;
			}
			if(current == null)
			{
				return false;
			}
		}
		//case 1 - node to delete has no childrens i.e leaf node
		
		if(current.left == null && current.right == null)
		{
			if(isLeftChild)
			{
				parent.left = null;
			}else {
				parent.right = null;
			}
		}
		
		//case 2 - node to delete has one child
		
		else if(current.left == null)
		{
			if(current == root)
			{
				root = current.right;
			}
			else if(isLeftChild)
			{
				parent.left = current.right;
			}else {
				parent.right = current.right;
			}
		}else if(current.right == null){
			if(current == root)
			{
				root = current.left;
			}
			else if(isLeftChild)
			{
				parent.left = current.left;
			}else {
				parent.right = current.left;
			}
		}
		
		// case 3 - node to delete has all childrens
		
		else if(current.left != null && current.right != null)
		{
			//get successor - smaller node in the right subtree of the node to be deleted
			
			Node successor = getSuccessor(current);
			if(root == current)
			{
				root = successor;
			}
			
			else if(isLeftChild)
			{
				parent.left = successor;
				
			}else {
				parent.right = successor;
			}
			successor.left = current.left;
		}
		
		return true;
		
	}
	
	private static Node getSuccessor(Node toDel)
	{
		Node sucsorParent = null;
		Node successor = null;
		Node current = toDel.right;
		
		while(current != null)
		{
			sucsorParent = successor;
			successor = current;
			current = current.left;
		}
		
		if(successor.right != null)
		{
			sucsorParent.left = successor.right;
			successor.right = toDel.right;
		}
		return successor;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST bst = new BST();
		bst.insert(10);
		bst.insert(8);
		bst.insert(12);
		bst.insert(6);
		bst.insert(9);
		bst.insert(11);
		bst.insert(16);
		bst.insert(7);
		
		//System.out.println(bst.coantains(13));
		//System.out.println(bst.search(6));
		//bst.inOrderDispaly();
		//System.out.println("***************");
		bst.delete(8);
		//bst.inOrderDispaly();
		
		bst.display();
	}
	
	class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
		}
		
		
	}

}
