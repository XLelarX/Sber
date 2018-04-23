package com.company;

import java.util.Arrays;

public class ArrayList implements List {
    private int size = 0;
    private Object[] array;

    public ArrayList() {
        array = new Object[10];
    }

    public ArrayList(int initialSize) {
        array = new Object[initialSize];
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
        while (size < array.length && array[size] != null)
            size++;
        if (size >= array.length) {

            Object[] buffer = array;
            this.size += this.size >> 1 + 1;
            array = new Object[this.size];
            System.arraycopy(buffer, 0, array, 0, buffer.length);
//            array[i + 1] = item;
//            for (int j = 0; j < array.length; j++)
//                array[j] =
        } else if (array[size] == null) {
            array[size] = item;
            ++this.size;
        }
    }

    @Override
    public void add(int index, Object item) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
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
