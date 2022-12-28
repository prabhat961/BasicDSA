package stacks;

import static java.lang.System.exit;

class StackUsingLinkedlist {

    // A linked list node
    private class Node {
        int data; // integer data
        Node link; // reference variable Node type
    }

    Node top;

    StackUsingLinkedlist() {
        this.top = null;
    }

    public void push(int x) {
        Node temp = new Node();
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).link;
    }

    public void display() {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.link;
                if (temp != null)
                    System.out.print(" -> ");
            }
        }
    }

    public class LinkedListImplementation {
    }
}
