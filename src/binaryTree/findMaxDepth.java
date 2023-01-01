package binaryTree;

public class findMaxDepth {
    public static int printMaxDepth(Node node){
      if(node == null)
          return 0;
      else{
          int leftDepth = printMaxDepth(node.left);
          int rightDepth = printMaxDepth(node.right);
          if (leftDepth > rightDepth)
              return (leftDepth + 1);
          else
              return (rightDepth + 1);
      }
    }

    public static void main(String[] args) {


        Node root = new Node(1);
        Node root.left = new Node(2);
        Node root.right = new Node(3);
        Node root.left.left = new Node(4);
        Node root.left.right = new Node(5);

        System.out.println("Height of tree is "
                + findMaxDepth.maxDepth(tree.root));
    }
}
