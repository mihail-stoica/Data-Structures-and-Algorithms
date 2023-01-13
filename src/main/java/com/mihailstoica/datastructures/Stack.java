package com.mihailstoica.datastructures;

import java.util.EmptyStackException;

// LIFO - Last In First Out
public class Stack<T> {

    private class Node {

        private T data;

        private Node next;

        private Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(T data) {
        // Create new node
        Node newNode = new Node(data);
        // Set it's next to be head
        newNode.next = head;
        // Set head to be the new node
        head = newNode;
        // Increase the stack size
        this.size++;

    }

    public T pop() {

        if (head == null) {
            throw new EmptyStackException();
        }

        // Store the value we want to return
        T data = head.data;
        // Set the current head.next to be the new head
        head = head.next;
        // Decrease the stack size
        this.size--;
        // Return the value
        return data;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public T peek() {
       return head.data;
    }
}
