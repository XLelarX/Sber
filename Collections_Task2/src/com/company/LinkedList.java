package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Deque<T>, List<T> {
    private class ListIterator implements Iterator<T> {
        private Node<T> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            return current.item;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size;

    @Override
    public void addFirst(T item) {
        Node<T> oldFirst = first;
        Node<T> newFirst = new Node<>(item, oldFirst, null);
        first = newFirst;
        if (oldFirst == null)
            last = newFirst;
        else
            oldFirst.prev = newFirst;
        size++;
//        if (size == 0) {
//            first = last = new Node<>(item, null, null);
//        } else {
//            first = new Node<>(item, first, null);
//            first.next.prev = null;
//        }

    }

    @Override
    public void addLast(T item) {
        Node<T> oldLast = last;
        Node<T> newLast = new Node<>(item, null, oldLast);
        last = newLast;
        if (oldLast == null)
            first = newLast;
        else
            oldLast.next = newLast;
        size++;
    }

    @Override
    public T removeFirst() {
        checkForRange();
        return deleteFirstNode();
    }


    @Override
    public T pollFirst() {
        return (size == 0) ? null : deleteFirstNode();
    }

    private T deleteFirstNode() {
        T deletedItem = first.item;

        first = first.next;
        if (first == null)
            last = null;
        else
            first.prev = null;
        size--;

        return deletedItem;
    }

    @Override
    public T removeLast() {
        checkForRange();
        return deleteLastNode();
    }

    @Override
    public T pollLast() {
        Node<T> buf = last;
        if (size > 0)
            deleteLastNode();
        else return null;
        return buf.item;
    }

    private T deleteLastNode() {
        T deletedItem = last.item;

        last = last.prev;
        if (last == null)
            first = null;
        else
            last.next = null;
        size--;

        return deletedItem;
    }

    @Override
    public T getFirst() {
        checkForRange();
        return first.item;
    }

    @Override
    public T getLast() {
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
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void add(int index, T item) {
        get(index);// ToDo
    }

    @Override
    public T get(int index) {
        return getNode(index).item;
    }

    private Node<T> getNode(T item) {
        if (item == null) {
            for (Node<T> current = first; current != null; current = current.next) {
                if (current.item == null)
                    return current;
            }
        } else {
            for (Node<T> current = first; current != null; current = current.next) {
                if (item.equals(current.item))
                    return current;
            }
        }
        throw new NoSuchElementException();
    }

    private Node<T> getNode(int index) {
        checkForRange(index);
        Node<T> result;
        if (index < size / 2) {
            result = first;
            for (int i = 0; i < index; i++)
                result = result.next;
        } else {
            result = last;
            for (int i = size - 1; i > index; i--)
                result = result.prev;
        }
        return result;
    }

    private void checkForRange() {
        checkForRange(0);
    }

    private void checkForRange(int index) {
        if ((index >= 0) && (size <= index))
            throw new NoSuchElementException();
    }

    @Override
    public int indexOf(T obj) {
        int index = 0;

        if (obj == null) {
            for (Node<T> current = first; current != null; current = current.next) {
                if (current.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node<T> current = first; current != null; current = current.next) {
                if (obj.equals(current.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T obj) {
        int index = size;

        if (obj == null)
            for (Node<T> current = last; current != null; current = current.prev) {
                index--;
                if (current.item == null)
                    return index;
            }
        else
            for (Node<T> current = last; current != null; current = current.prev) {
                index--;
                System.out.println(current.item);
                if (obj.equals(current.item))
                    return index;
            }
        return -1;
    }

    @Override
    public void set(int index, T item) {
        getNode(index).item = item;
    }

    @Override
    public void remove(int index) {
        removeNode(getNode(index));
    }

    private void removeNode(Node<T> current) {
        Node<T> next = current.next;
        Node<T> prev = current.prev;

        if (prev != null)
            prev.next = next;
        else
            first = next;

        if (next != null)
            next.prev = prev;
        else
            last = prev;

        //        current.item = null;
        size--;
    }

    @Override
    public void remove(T item) {
        removeNode(getNode(item));
    }

    @Override
    public List<T> subList(int from, int to) {
        checkForRange(from, to);

        LinkedList<T> sub = new LinkedList<>();
        Node<T> first = getNode(from);

        int length = to - from;

        for (int i = from; i <= length; i++) {
            sub.add(first.item);
            first = first.next;
        }

        return sub;
    }

    private void checkForRange(int from, int to) {
        checkForRange(from);
        checkForRange(to);

        if (to < from)
            throw new NoSuchElementException();
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
}
