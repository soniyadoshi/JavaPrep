package datastructures;

/*
 * find lowest common ancestor in binary tree
 */
public class LCAinBinaryTree {
	BTTreeNode root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCAinBinaryTree lsBT = new LCAinBinaryTree();
		lsBT.root = new BTTreeNode(1);
		lsBT.root.left = new BTTreeNode(2);
		lsBT.root.right = new BTTreeNode(3);
		lsBT.root.left.left = new BTTreeNode(4);
		lsBT.root.left.right = new BTTreeNode(5);
		lsBT.root.right.left = new BTTreeNode(6);
		lsBT.root.right.right = new BTTreeNode(7);
		
		System.out.println(lsBT.leastNodeRec(lsBT.root,4, 6).data);

	}
	
	private BTTreeNode leastNode (int n1, int n2) {
		BTTreeNode temp = root;
		if (temp == null) {
			return null;
		}
		if (temp.data == n1 || temp.data == n2) {
			return temp;
		}
		BTTreeNode lTree = null;
		BTTreeNode rTree = null;
		while (temp.left != null) {
			if (temp.left.data == n1 || temp.left.data == n2) {
				lTree = temp;
			}
			temp = temp.left;
		}
		temp = lTree != null ? lTree : root;
		while (temp.right != null) {
			if (temp.right.data == n1 || temp.right.data == n2) {
				rTree = temp;
			}
			temp = temp.right;
		}
		if (lTree != null && rTree !=null) {
			return temp;
		}
		if (rTree == null) {
			
		}
		return lTree != null ? lTree : rTree;
	}
	
	private BTTreeNode leastNodeRec (BTTreeNode nd, int n1, int n2) {
		if (nd == null) {
			return null;
		}
		if (nd.data == n1 || nd.data == n2) {
			return nd;
		}
		BTTreeNode lTree = leastNodeRec(nd.left, n1, n2);
		BTTreeNode rTree = leastNodeRec(nd.right, n1, n2);
		
		if (lTree !=null && rTree !=null) {
			return nd;
		}
		
		return lTree !=null ? lTree : rTree;
	}

}

class BTTreeNode {
	BTTreeNode left;
	BTTreeNode right;
	int data;
	
	BTTreeNode (int d) {
		this.data = d;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		return "BTTreeNode [left=" + left + ", right=" + right + ", data=" + data + "]";
	}
	
}
