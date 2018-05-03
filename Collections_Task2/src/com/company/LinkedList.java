package com.company;

import java.util.NoSuchElementException;

public class LinkedList implements Deque, List {

    private Node first;
    private Node last;
    private int size;

    @Override
    public void addFirst(Object item) {
        Node oldFirst = first;
        Node newFirst = new Node(item, oldFirst, null);
        first = newFirst;
        if (oldFirst == null)
            last = newFirst;
        else
            oldFirst.prev = newFirst;

        if (size == 0) {
            first = last = new Node(item, null, null);
        } else {
            first = new Node(item, first, null);
            first.next.prev = null;
        }
        size++;
    }

    @Override
    public void addLast(Object item) {
        Node oldLast = last;
        Node newLast = new Node(item, null, oldLast);
        last = newLast;
        if (oldLast == null)
            first = newLast;
        else
            oldLast.next = newLast;
        size++;
    }

    @Override
    public Object removeFirst() {
        checkForRange();
        return deleteFirstNode();
    }


    @Override
    public Object pollFirst() {
        return (size == 0) ? null : deleteFirstNode();
    }

    private Object deleteFirstNode() {
        Object deletedItem = first.item;

        first = first.next;
        if (first == null)
            last = null;
        else
            first.prev = null;
        size--;

        return deletedItem;
    }

    @Override
    public Object removeLast() {
        checkForRange();
        Object deletedItem = last.item;
        deleteLastNode();
        return deletedItem;
    }

    private void checkForRange() {
        if (size <= 0)
            throw new NoSuchElementException();
    }

    @Override
    public Object pollLast() {
        Node buf = last;
        if (size > 0)
            deleteLastNode();
        else return null;
        return buf.item;
    }

    private void deleteLastNode() {
        last = last.prev;
        if (last == null)
            first = null;
        else
            last.next = null;
        size--;
    }

    @Override
    public Object getFirst() {
        checkForRange();
        return first.item;
    }

    @Override
    public Object getLast() {
        checkForRange();
        return last.item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object item) {
        addLast(item);
    }

    @Override
    public void add(int index, Object item) {

    }

    @Override
    public Object get(int index) {
        checkForRange(index);
        Node result;
        if (index < size / 2) {
            result = first;
            for (int i = 0; i < index; i++)
                result = result.next;
        } else {
            result = last;
            for (int i = size - 1; i > index; i--)
                result = result.prev;
        }
        return result.item;
    }

    private void checkForRange(int index) {
        if (index > size)
            throw new NoSuchElementException();
    }

    @Override
    public int indexOf(Object obj) {
        int index = 0;
        for (Node current = first; (index < size) && !current.item.equals(obj); ++index) {
            current = current.next;
        }
        return (index == size) ? -1 : index;
    }

    @Override
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override
    public void set(int index, Object item) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(Object item) {

    }

    @Override
    public List subList(int from, int to) {
        return null;
    }
}
