package datastructures;

public class TreeIterator {

    TNode root;

    public static void main (String args[]) {

        TreeIterator tree = new TreeIterator();
        tree.root = new TNode(1);
        tree.root.left = new TNode(2);
        tree.root.right = new TNode(3);
        tree.root.left.left = new TNode(4);
        tree.root.left.right = new TNode(5);
        tree.root.right.left = new TNode(6);
        tree.root.right.right = new TNode(7);

    }

    public void inOrder () {

    }

    public void preOrder () {

    }

    public void postOrder() {
        
    }
}

class TNode {
    TNode left;
    TNode right;
    int data;

    public TNode(int d) {
        this.left = null;
        this.right = null;
        this.data = d;
    }

}
