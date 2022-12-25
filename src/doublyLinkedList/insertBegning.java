package doublyLinkedList;

import static doublyLinkedList.doublyLinkedListImplementation.printlist;

public class insertBegning {
    public static Node insertFIrst(Node head, int data){
        Node curr = new Node(data);
        curr.next = head;
        if (head != null)
            head.prev = curr;
        return curr;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=insertFIrst(head,5);
        printlist(head);
    }
}
