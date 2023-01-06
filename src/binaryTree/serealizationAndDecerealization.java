package binaryTree;

import java.util.ArrayList;

public class serealizationAndDecerealization {
    static final int EMPTY=-1;
    public static void serialize(Node root, ArrayList<Integer> arr){
        if(root==null){
            arr.add(EMPTY);
            return;
        }
        arr.add(root.data);
        serialize(root.left,arr);
        serialize(root.right,arr);
    }
    static int index=0;
    public static Node deSerialize(ArrayList<Integer> arr){
        if(index==arr.size())
            return null;
        int val=arr.get(index);
        index++;
        if(val==EMPTY)return null;
        Node root=new Node(val);
        root.left=deSerialize(arr);
        root.right=deSerialize(arr);
        return root;
    }
}
