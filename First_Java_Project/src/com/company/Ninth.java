package com.company;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt(), s = 0, sn = 1;
        System.out.println("0\n1");
        for (long i = 2; i <= n; i++){
            if (i%2 == 0) {
                s += sn;
                System.out.println(s);
            }
            else {
                sn += s;
                System.out.println(sn);
            }
        }
    }
}
