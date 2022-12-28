package stacks;

import java.util.ArrayList;
import java.util.Collections;

public class NextGreaterElement {
    //Method 1:
    public static void printNextGreater(int[] arr) {
        int i, j, next;
        for (i = 0; i < arr.length; i++) {
            next = -1;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "    " + next);
        }
    }
    //Method 2: Using Stack

    public static ArrayList<Integer> nextGreater(int arr[], int n){
        ArrayList<Integer> v=new ArrayList<>();
        Stack <Integer> s=new Stack<>();
        s.add(arr[n-1]);v.add(-1);
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i])
                s.pop();
            int ng=s.isEmpty()?-1:s.peek();
            v.add(ng);
            s.add(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }
}
