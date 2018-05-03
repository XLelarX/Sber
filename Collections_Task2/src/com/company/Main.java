package com.company;

public class Main {

    public static void main(String[] args) {
        // java.util.LinkedList
        LinkedList list = new LinkedList();
        list.addFirst("add2");
        list.addFirst("add3");
        list.addFirst("add");
        System.out.println(list.getFirst());
        System.out.println(list.indexOf("add"));
    }
}
