package SinglylinkedLists;

import java.util.HashSet;

public class loopdetection {
   public static boolean isLoop(Node head) {
       Node temp=new Node(0);
        Node curr=head;
        while (curr != null) {
            if (curr.next==null)
                return false;
            if(curr.next==temp)
                return true;
            Node curr_next=curr.next;
            curr.next=temp;
            curr=curr_next;
        }
        return false;
    }
    public static boolean isLoopTwwo(Node head)
    {   HashSet<Node> s=new HashSet<Node>();
        for(Node curr=head;curr!=null;curr=curr.next) {
            if (s.contains(curr))
                return true;
            s.add(curr);
        }
        return false;
    }
    static boolean isLoopThree(Node head)
    {   Node slow_p = head,fast_p = head;

        while (fast_p!=null && fast_p.next!=null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return true;
            }
        }
        return false;
    }

}
