package datastructures;

/*
 * find lowest common ancestor in binary search tree
 */
public class LCAinBST {
	
	TreeNode root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCAinBST lsBST = new LCAinBST();
		lsBST.root = new TreeNode(20);
		lsBST.root.left = new TreeNode(8);
		lsBST.root.right = new TreeNode(22);
		lsBST.root.left.left = new TreeNode(4);
		lsBST.root.left.right = new TreeNode(12);
		lsBST.root.right.left = new TreeNode(10);
		lsBST.root.right.right = new TreeNode(14);
		
		System.out.println(lsBST.leastNode(10, 22).data);
	}
	
	public TreeNode leastNode (int n1, int n2) {
		TreeNode temp = root;
		while(temp != null) {
			if (n1 < temp.data && n2 < temp.data) {
				temp = temp.left;
			} else if (n1 > temp.data && n2 > temp.data) {
				temp = temp.right;
			} else {
				return temp;
			}
		}
		return null;
	}
}

class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;
	
	TreeNode (int d) {
		this.data = d;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		return "TreeNode [left=" + left + ", right=" + right + ", data=" + data + "]";
	}
	
}
