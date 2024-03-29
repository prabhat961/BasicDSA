package doublyLinkedList;

public class reverse {
    public static Node reverse(Node head){
        if (head == null || head.next == null)
            return head;
        Node prev = null, curr = head;
        while(curr != null){
          prev = curr.prev;
          curr.prev = curr.next;
          curr.next = prev;
          curr = curr.prev;
        }
        return prev.prev;
    }
}
