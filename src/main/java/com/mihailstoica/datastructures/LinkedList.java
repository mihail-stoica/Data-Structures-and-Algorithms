package com.mihailstoica.datastructures;

public class LinkedList<T> {
    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    public void addFront(T data) {

        // Create new node
        Node newNode = new Node(data);

        // if head...
        if (head == null) {
            head = newNode;
            return;
        }

        // Set it's next to current head
        newNode.next = head;

        // Set current head equal to this new head
        head = newNode;
    }

    public T getFirst() {

        if (head == null) {
            throw new IllegalStateException("Empty list!");
        }

        return head.data;
    }

    // A more efficient solution O(1) is to have a pointer to the tail
    public T getLast() {

        if (head == null) {
            throw new IllegalStateException("Empty list!");
        }

        Node current = head;

        // while we are not at the tail
        while (current.next != null) {
            current = current.next; // O(n)
        }

        // We are at the tail
        return current.data;
    }

    public void addBack(T data) {

        Node newNode = new Node (data);

        // if head... set and return
        if (head == null) {
            head = newNode;
            return;
        }

        // Else starting at head...
        Node current = head;

        // Walk until to hit tail
        while (current.next != null) {
            current = current.next;
        }

        // Set current node to equal newNode
        current.next = newNode;
    }

    // A more efficient solution is to create a counter in the class and keeping track of it when add/delete
    public int size() {

        if (head == null) {
            return 0;
        }

        int count = 1;
        Node current = head;

        while (current.next != null) {
            current = current.next; // O(n)
            count++;
        }

        return count;
    }

    public void clear() {
        head = null;
    }

    public void deleteValue(T data) {

        // if head
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }

        // else walk the list
        Node current = head;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void print() {

        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println();
    }

}
