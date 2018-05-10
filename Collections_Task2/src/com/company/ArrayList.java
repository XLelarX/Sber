package com.company;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private int size = 0;
    private T[] array;

    private ArrayList(T[] array) {
        this.array = array;
        size = array.length;
    }

    @SuppressWarnings("unchecked")
    public ArrayList() {
        array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int initialSize) {
        array = (T[]) new Object[initialSize];
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
        growAsNeeded();
        array[size++] = item;
    }

    private void growAsNeeded() {
        if (array.length == size)
            array = Arrays.copyOf(array, array.length + (array.length >> 1) + 1);
    }

    @Override
    public void add(int index, T item) {
        checkForRange(index);
        growAsNeeded();
        System.arraycopy(array, index, array, index + 1, size - index + 1);
        array[index] = item;
        size++;
    }

    @Override
    public T get(int index) {
        checkForRange(index);
        return array[index];
    }

    private void checkForRange(int index) {
        if ((index >= size) || (index < 0))
            throw new IndexOutOfBoundsException(buildOutOfBoundsMessage(index));
    }

    private String buildOutOfBoundsMessage(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    @Override
    public int indexOf(T obj) {
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null)
                    return i;
            }
        } else for (int i = 0; i < size; i++) {
            if (array[i].equals(obj))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T obj) {
        if (obj == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i] == null)
                    return i;
            }
        } else for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(obj))
                return i;
        }
        return -1;
    }

    @Override
    public void set(int index, T item) {
        checkForRange(index);
        array[index] = item;
    }

    @Override
    public void remove(int index) {
        checkForRange(index);
        System.arraycopy(array, index + 1, array, index, size - index + 2);
        size--;
    }

    @Override
    public void remove(T item) {
        if (item == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i] == null) {
                    fastRemove(i);
                    return;
                }
            }
        } else for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(item)) {
                fastRemove(i);
                return;
            }
        }
    }

    private void fastRemove(int i) {
        System.arraycopy(array, i + 1, array, i, size - i + 2);
        size--;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List subList(int from, int to) {
        checkForSubRange(from, to);

        T subArray[] = (T[]) new Object[to - from];
        System.arraycopy(array, from, subArray, 0, to - from);
        return new ArrayList(subArray);
    }

    private void checkForSubRange(int from, int to) {
        if (!((from < to) && (from >= 0) && (to < size)))
            throw new IndexOutOfBoundsException(buildOutOfBoundsMessage(from));
    }
}
