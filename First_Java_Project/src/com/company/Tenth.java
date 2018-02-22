package com.company;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        System.out.println((int)(a + Math.random() * (b - a)));
    }
}
