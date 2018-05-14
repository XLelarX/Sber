package com.company;

public interface Deque<T> extends Collection<T> {

    void addFirst(T item);

    void addLast(T item);

    T removeFirst();

    T removeLast();

    T getFirst();

    T getLast();

    T pollFirst();

    T pollLast();
}
