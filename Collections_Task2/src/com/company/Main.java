package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        for (int i = 0; i < 11; i++) {
            a.add("ss");
            System.out.println(a.size());
        }
        //System.out.println(a.size());
        //System.out.println(a.array.length);
        //System.out.println(a.size());
    }
}
