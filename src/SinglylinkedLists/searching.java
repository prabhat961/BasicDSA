package SinglylinkedLists;

public class searching {
    public static int seearchItrative(Node head, int x){
        int pos = 1;
        Node curr = head;
        while(curr != null){
            if (curr.data == x)
                return pos;
            else{
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
    public static int searchRec(Node head, int x){
        if(head==null)return -1;
        if(head.data==x)return 1;
        else{
            int res=searchRec(head.next,x);
            if(res==-1)return -1;
            else return res+1;
        }
    }
}
