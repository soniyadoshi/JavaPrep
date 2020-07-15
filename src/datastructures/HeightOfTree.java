package datastructures;

import java.util.LinkedList;
import java.util.Queue;

/*
Height Of binary tree
 */
public class HeightOfTree {
    Node root;
    public static void main(String args[]) {
        HeightOfTree tree = new HeightOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
//        System.out.println("Height of tree is : " +
//                tree.recHeight(tree.root));
        System.out.println("Height of tree is : " +
                tree.findHeightOfTree(tree.root));

    }

    public int recHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int l = recHeight(root.left);
        int r = recHeight(root.right);
        return l > r ? (l + 1) : (r + 1);

    }

    public int findHeightOfTree (Node root) {
        if (root == null) {
            return 0;
        }
        int ht = 0;
        int ndCnt = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (1 == 1) {
            ndCnt = q.size();
            if (ndCnt == 0) {
                return ht;
            }
            ht++;
            while (ndCnt > 0) {
                Node d = q.peek();
                q.remove();
                if (d.left != null) {
                    q.add(d.left);
                }
                if (d.right != null) {
                    q.add(d.right);
                }
                ndCnt--;
            }
        }
    }
}
