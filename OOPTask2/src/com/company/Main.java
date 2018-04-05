package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Complex comp1 = new Complex(in.next());
        System.out.println(comp1.toString());
        Complex comp2 = new Complex(in.next());
        System.out.println(comp2.toString());
        Complex comp3 = comp1.add(comp2);
        System.out.println(comp3.toString());
    }
}
