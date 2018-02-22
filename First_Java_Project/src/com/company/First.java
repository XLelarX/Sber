package com.company;

import java.util.Scanner;

public class First{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short a = in.nextShort(), b = in.nextShort();
        System.out.println(a + "/" + b + " = " + a/b + " и " + a%b + " в остатке");
    }
}
