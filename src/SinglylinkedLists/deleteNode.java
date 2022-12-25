package SinglylinkedLists;

import static SinglylinkedLists.singlyLInkedListImplementation.printListRecursive;

public class deleteNode {
    public static doublyLinkedList.Node deleteHead(doublyLinkedList.Node head){
        if (head == null)
            return null;
        else
                return head.next;
    }
    public static doublyLinkedList.Node deleteTail(doublyLinkedList.Node head){
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        doublyLinkedList.Node curr = head;
        while(curr.next.next != null)
            curr = curr.next;
            curr.next = null;
            return  head;

    }

    public static void main(String[] args) {
        doublyLinkedList.Node head=new doublyLinkedList.Node(10);
        head.next=new doublyLinkedList.Node(20);
        head.next.next=new doublyLinkedList.Node(30);
        deleteHead(head);
        head=deleteHead(head);
        printListRecursive(head);
    }
}
