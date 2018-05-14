package com.company;

public interface List<T> extends Collection<T> {
    void add(int index, T item);

    T get(int index);

    int indexOf(T obj);

    int lastIndexOf(T obj);

    void set(int index, T item);

    void remove(int index);

    List<T> subList(int from, int to);
}
