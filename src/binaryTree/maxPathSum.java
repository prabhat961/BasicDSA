package binaryTree;
class Res {
    int val;
}
public class maxPathSum {
    int maxPathSumUtil(Node node, Res res) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return node.data;
        int ls = maxPathSumUtil(node.left, res);
        int rs = maxPathSumUtil(node.right, res);
        if (node.left != null && node.right != null) {
            res.val = Math.max(res.val, ls + rs + node.data);
            return Math.max(ls, rs) + node.data;
        }
        return (node.left == null) ? rs + node.data
                : ls + node.data;
    }
    int maxPathSum(Node node)
    {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;

        if(root.left==null || root.right==null){
            root=setTree(root);
        }
        maxPathSumUtil(root, res);
        return res.val;
    }
}
