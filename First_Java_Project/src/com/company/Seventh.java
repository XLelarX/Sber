package com.company;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = in.nextInt(), i = 0;
        for (i = a; i > 1; i--){
            int b = a;
            if (b%i == 0 && i != a)
                break;
        }
        if (i == 1)
            System.out.println("Простое");
        else
            System.out.println("Составное");
    }
}
