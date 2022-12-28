package SinglylinkedLists;

import java.util.ArrayList;

public class reverseLinkedList {
    public static Node reverseNaive(Node head){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(Node curr=head;curr!=null;curr=curr.next){
            arr.add(curr.data);
        }
        for(Node curr=head;curr!=null;curr=curr.next){
            curr.data=arr.remove(arr.size()-1);
        }
        return head;
    }
    public static Node reverseEfficient(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public  static Node revRecOne(Node head){
        if(head==null||head.next==null)return head;
        Node rest_head=revRecOne(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
    public  static Node revRecTwo(Node curr, Node prev){
        if(curr==null)return prev;
        Node next=curr.next;
        curr.next=prev;
        return revRecTwo(next,curr);
    }
}
