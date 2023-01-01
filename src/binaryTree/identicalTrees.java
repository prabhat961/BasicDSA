package binaryTree;

public class identicalTrees {
    boolean identicalTrees(Node a, Node b) {
        if (a == null && b == null)
            return true;
        if (a != null && b != null)
            return (a.data == b.data
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));
        return false;
    }
}
