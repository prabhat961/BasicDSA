package SinglylinkedLists;

import static SinglylinkedLists.singlyLInkedListImplementation.printListRecursive;

public class insertAtBegning {
    public static doublyLinkedList.Node insertBegning(doublyLinkedList.Node head, int x){
        doublyLinkedList.Node curr = new doublyLinkedList.Node(x);
        curr.next = head;
        return curr;
    }
    public static void main(String[] args) {
        doublyLinkedList.Node head = null;
        head = insertBegning(head, 10);
        head = insertBegning(head, 900);
        head = insertBegning(head, 101);
        head = insertBegning(head, 189);
        printListRecursive(head);

      }
}