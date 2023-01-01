package binaryTree;

import static binaryTree.findMaxDepth.printMaxDepth;

public class chkRightBalanced {
    boolean isBalanced(Node node) {
        int lh;
        int rh;
        if (node == null)
            return true;
        lh = printMaxDepth(node.left);
        rh = printMaxDepth(node.right);
        if (Math.abs(lh - rh) <= 1 && isBalanced(node.left)
                && isBalanced(node.right))
            return true;
        return false;
    }
}
