package binarySearchTree;

public class BSTcheacker {
    public static int maxValue(node Node){
        if (Node == null){
            return Integer.MIN_VALUE;
        }
        int value = Node.key;
        int leftMax = maxValue(Node.left);
        int rightMax = maxValue(Node.right);

        return Math.max(value, Math.max(leftMax, rightMax));
    }
    public static int minValue(node Node) {
        if (Node == null) {
            return Integer.MAX_VALUE;
        }
        int value = Node.key;
        int leftMax = minValue(Node.left);
        int rightMax = minValue(Node.right);

        return Math.min(value, Math.min(leftMax, rightMax));
    }
    public static int isBST(node Node){
        if (Node == null) {
            return 1;
        }
        if (Node.left != null
                && maxValue(Node.left) > Node.key) {
            return 0;
        }
        if (Node.right != null
                && minValue(Node.right) < Node.key) {
            return 0;
        }
        if (isBST(Node.left) != 1
                || isBST(Node.right) != 1) {
            return 0;
        }
        return 1;
    }
}
