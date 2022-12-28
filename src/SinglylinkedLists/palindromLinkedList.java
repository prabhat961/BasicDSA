package SinglylinkedLists;

public class palindromLinkedList {
    boolean isPalindrome(Node head) {
        Node slow_ptr = head;
        Node fast_ptr = head;
        Node prev_of_slow_ptr = head;
        Node midnode = null; // To handle odd size list
        boolean res = true; // initialize result
        if (head != null && head.next != null) {
            while (fast_ptr != null
                    && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                prev_of_slow_ptr = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            if (fast_ptr != null) {
                midnode = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            Node second_half = slow_ptr;
            prev_of_slow_ptr.next
                    = null; // NULL terminate first half
            reverse(); // Reverse the second half
            res = compareLists(head,
                    second_half); // compare
            reverse(); // Reverse the second half again
            if (midnode != null) {
                prev_of_slow_ptr.next = midnode;
                midnode.next = second_half;
            }
            else
                prev_of_slow_ptr.next = second_half;
        }
        return res;
    }
    void reverse() {
        Node prev = null;
        Node second_half = null;
        Node current = second_half;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        second_half = prev;
    }
    boolean compareLists(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else
                return false;
        }

        /* Both are empty return 1*/
        if (temp1 == null && temp2 == null)
            return true;
        return false;
    }
}
