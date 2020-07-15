package datastructures;

public class LeastCommonAncestorBST {
	
	 static Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeastCommonAncestorBST tree = new LeastCommonAncestorBST();
		  tree.root = tree.new Node(20);
	        tree.root.left = tree.new Node(8);
	        tree.root.right = tree.new Node(22);
	        tree.root.left.left = tree.new Node(4);
	        tree.root.left.right = tree.new Node(12);
	        tree.root.left.right.left = tree.new Node(10);
	        tree.root.left.right.right = tree.new Node(14);	
		
		
		int cmAnc = tree.findLowestCmAncstr(root, 8, 14);
		System.out.println(cmAnc);

	}
	
	private int findLowestCmAncstr(Node current, int n1, int n2)
	{
		if(current == null)
		{
			return 0;
		}
		if(n1 < current.data && n2 < current.data)
		{
			return findLowestCmAncstr(current.left, n1, n2);
		}
		if(n1> current.data && n2 > current.data)
		{
			return findLowestCmAncstr(current.right, n1, n2);
		}
		
		return current.data;
		
	}



 class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data = data;
		left = null;
		right = null;		
	}
}
}
