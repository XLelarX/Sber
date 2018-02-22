package com.company;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = in.nextInt();
        for (int i = a; i > 0; i--){
            if (a%i == 0)
                System.out.println(i);
        }
    }
}
