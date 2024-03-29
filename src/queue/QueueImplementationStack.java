package queue;

import java.util.*;

static class Stack
{
    // Two inbuilt queues
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();

    // To maintain current number of
    // elements
    static int curr_size;

    Stack()
    {
        curr_size = 0;
    }

    // Method to implement push() operation
    static void push(int x)
    {
        curr_size++;

        // Push x first in empty q2
        q2.add(x);

        // Push all the remaining
        // elements in q1 to q2.
        while (!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }

        // swap the names of two queues
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    // Method to implement pop() operation
    static void pop(){

        // if no elements are there in q1
        if (q1.isEmpty())
            return ;

        q1.remove();
        curr_size--;
    }

    // Method to get the top element of Stack
    static int top()
    {
        if (q1.isEmpty())
            return -1;

        return q1.peek();
    }

    // Method to find the size of the Stack
    static int size()
    {
        return curr_size;
    }
}
public class QueueImplementationStack {
}
