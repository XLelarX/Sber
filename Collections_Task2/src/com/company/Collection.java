package com.company;

public interface Collection<T> extends Iterable<T> {
    boolean isEmpty();
    int size();
    void add(T item);
    void remove(T item);
//    void clear();
}
