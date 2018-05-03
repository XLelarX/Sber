package com.company;

class Node {
    Object item;
    Node next = null;
    Node prev = null;

    public Node() {
    }

    Node(Object item, Node next, Node prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}
