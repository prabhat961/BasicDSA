package binaryTree;

import java.util.*;

public class spiralForm {
    //Method1:
    public static void printSpiral(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        boolean reverse=false;
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(reverse)
                    s.add(curr.data);
                else
                    System.out.print(curr.data+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(reverse){
                while(s.isEmpty()==false){
                    System.out.print(s.pop()+" ");
                }
            }
            reverse=!reverse;
        }
    }//Method 2:
    public static void printSpiraloptimal(Node root){
        if (root == null)
            return;
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.add(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.empty()) {
                Node temp = s1.peek();
                s1.pop();
                System.out.print(temp.data + " ");

                if (temp.right != null)
                    s2.add(temp.right);

                if (temp.left != null)
                    s2.add(temp.left);
            }

            while (!s2.empty()) {
                Node temp = s2.peek();
                s2.pop();
                System.out.print(temp.data + " ");

                if (temp.left != null)
                    s1.add(temp.left);
                if (temp.right != null)
                    s1.add(temp.right);
            }
        }
    }
}
