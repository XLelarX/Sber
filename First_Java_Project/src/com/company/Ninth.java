package com.company;

import java.util.Scanner;

public class Ninth {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        long numberForCheck = input.nextInt();
        long s = 0;
        long sn = 1;
        System.out.println("0\n1");
        for (long i = 2; i <= numberForCheck; i++) {
            if (i % 2 == 0) {
                s += sn;
                System.out.println(s);
            } else {
                sn += s;
                System.out.println(sn);
            }
        }
    }
}
