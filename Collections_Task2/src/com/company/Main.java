package com.company;


public class Main {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        System.out.println(a.isEmpty());
        for (int i = 0; i < 10; i++) {
            a.add("s" + i);
            System.out.println(a.get(i));
        }
        System.out.println(a.size());
        System.out.println(a.array.length);
        a.add(6, "ss");
        for (int i = 0; i < a.array.length; i++) {
            System.out.println(a.array[i]);
        }

    }
}
