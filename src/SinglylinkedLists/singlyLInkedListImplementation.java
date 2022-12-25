package SinglylinkedLists;
class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class singlyLInkedListImplementation {
    //Itrative way to Print Node data:
    public static void printListItrative(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+",");
            curr = curr.next;
        }
    }
    //Recursive way to Print Node data:
    public static void printListRecursive(Node head){
        if (head == null)
            return;
        System.out.print(head.data+",");
        printListRecursive(head.next);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
       Node temp1 = new Node(20);
       Node temp2 = new .Node(30);
        head.next = temp1;
        head.next.next = temp2;
        printListItrative(head);
        printListRecursive(head);
    }
}
