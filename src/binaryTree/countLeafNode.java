package binaryTree;

public class countLeafNode {
    int getLeafCount(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }
}
