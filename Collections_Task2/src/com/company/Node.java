package com.company;

class Node<T> {
    T item;
    Node<T> next = null;
    Node<T> prev = null;

    public Node() {
    }

    Node(T item, Node<T> next, Node<T> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}
