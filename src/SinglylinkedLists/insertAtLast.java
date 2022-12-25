package SinglylinkedLists;

import static SinglylinkedLists.singlyLInkedListImplementation.printListRecursive;

public class insertAtLast {
    public static doublyLinkedList.Node insertLast(doublyLinkedList.Node head, int x){
        doublyLinkedList.Node temp=new doublyLinkedList.Node(x);
        if(head==null)return temp;
        doublyLinkedList.Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }

    public static void main(String[] args) {
        doublyLinkedList.Node head=null;
        head=insertLast(head,10);
        head=insertLast(head,20);
        head=insertLast(head,30);
        printListRecursive(head);
    }
}
