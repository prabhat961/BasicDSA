package binarySearchTree;

import java.util.HashSet;

public class pairSum {
    static boolean findpairUtil(node root, int sum, HashSet<Integer> set) {
        if (root == null)
            return false;
        if (findpairUtil(root.left, sum, set))
            return true;
        if (set.contains(sum - root.key)) {
            System.out.println("Pair is found ("
                    + (sum - root.key) + ", "
                    + root.key + ")");
            return true;
        }
        else
            set.add(root.key);
        return findpairUtil(root.right, sum, set);
    }
    static void findPair(node root, int sum) {
        HashSet<Integer> set = new HashSet<Integer>();
        if (!findpairUtil(root, sum, set))
            System.out.print("Pairs do not exit"
                    + "\n");
    }
}
