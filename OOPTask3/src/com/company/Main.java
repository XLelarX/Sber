package com.company;

public class Main {

    public static void main(String[] args) {
        Vector v = new Vector(1,2,3);
        System.out.println(v.toString());
        Vector v1 = new Vector(4,5,6);
        System.out.println(v1.toString());
        System.out.println(v.addition(v1));
        System.out.println(v.substraction(v1));
        System.out.println(v1.scalarComposition(v));
        System.out.println(v.getLength());
    }
}
