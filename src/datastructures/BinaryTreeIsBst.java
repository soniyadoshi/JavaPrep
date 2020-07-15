package datastructures;

public class BinaryTreeIsBst {
      static Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeIsBst tree = new BinaryTreeIsBst();
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;		

		tree.root= new Node(4);
		tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
		
		boolean fl = tree.isBST(root, min, max);
		
		if(fl) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}
	
	private boolean isBST(Node root, int min, int max)
	{
		if(root == null) // empty tree is an binary tree
		{
			return false;
		}
		
		if(root.data < min || root.data > max) // values less or greater than infinity is not a binary tree
		{
			return false;
		}
		
		return (isBST(root.left,min,root.data-1) //left subtree , root .data-1 is used to take care of duplicate values , BST does not conatin duplicate values
				&&
				isBST(root.right,root.data+1, max));// right subtree
				
		
	}
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}


