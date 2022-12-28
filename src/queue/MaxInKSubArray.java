package queue;

import java.util.*;

public class MaxInKSubArray {
    static void printMax(int arr[], int n, int k) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        for (int i = 0; i < k; ++i) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        for (int i=k; i < n; ++i) {
            System.out.print(arr[dq.peek()] + " ");
            while ((!dq.isEmpty()) && dq.peek() <= i - k)
                dq.removeFirst();
            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()]);
    }
}
