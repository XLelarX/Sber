package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //java.util.LinkedList
        list.addLast("add2");
        list.addFirst("add");
        list.addFirst("add3");
        list.addFirst("add");
        int count = 2;
        System.out.println(list.get(count) + "\n");
        list.remove(count);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

    }
}
