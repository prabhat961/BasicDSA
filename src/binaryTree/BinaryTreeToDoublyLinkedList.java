package binaryTree;

public class BinaryTreeToDoublyLinkedList {
    static Node prev = null;
    public static Node BTToDLL(Node root){
        if(root==null)return root;
        Node head=BTToDLL(root.left);
        if(prev==null){head=root;}
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        BTToDLL(root.right);
        return head;
    }
}
