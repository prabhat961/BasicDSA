package binaryTree;

public class leftView {
    static int maxLevel=0;
    public static void printLeft(Node root,int level){
        if(root==null)
            return;
        if(maxLevel<level){
            System.out.print(root.data+" ");
            maxLevel=level;
        }
        printLeft(root.left,level+1);
        printLeft(root.right,level+1);
    }

    public static void printLeftView(Node root){
        printLeft(root,1);
    }
}
