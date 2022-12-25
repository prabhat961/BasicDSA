package SinglylinkedLists;

public class middleNode {
    //Naive Approach:
    public static void printMiddle(Node head){
        if (head == null)
            return;
        int count = 0;
        Node curr;
        for (curr = head; curr!= null; curr = curr.next)
            count++;
        curr = head;
        for (int i = 0; i < count/2; i++)
            curr = curr.next;
            System.out.print(curr.data);
    }
    //Effecient Approach:
    public static void printMiddleNode(Node head){
        if (head == null)
            return;
        Node slow = head, fast = head;
        while (fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}
