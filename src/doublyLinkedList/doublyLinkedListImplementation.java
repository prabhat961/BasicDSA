package doublyLinkedList;
class Node{
int data;
Node next;
Node prev;
Node(int x){
    data = x;
    next = null;
    prev = null;
    }
}

public class doublyLinkedListImplementation {
    public static void main(String args[]) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        printlist(head);
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
