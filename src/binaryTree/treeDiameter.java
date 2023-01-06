package binaryTree;

public class treeDiameter {
    //Naive:
    public static int heightNaive(Node root){
        if(root==null)
            return 0;
        else
            return (1+Math.max(height(root.left),height(root.right)));
    }

    public static int diameter(Node root){
        if(root==null)return 0;
        int d1=1+height(root.left)+height(root.right);
        int d2=diameter(root.left);
        int d3=diameter(root.right);

        return Math.max(d1,Math.max(d2,d3));
    }
    //Effecient:
    static int res=0;
    public static int height(Node root){
        if(root==null)
            return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        res=Math.max(res,1+lh+rh);

        return 1+Math.max(lh,rh);
    }
}
