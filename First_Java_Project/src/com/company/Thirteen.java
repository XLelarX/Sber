package com.company;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = (char)((int)(65 + Math.random() * (90 - 65))) ;
        boolean end = true;
        System.out.println(a);
        while (end){
            System.out.print("Введите букву : ");
            char b = in.next().charAt(0);
            if ((int)a < (int)b)
                System.out.println("You're too high");
            if ((int)a > (int)b)
                System.out.println("You're too low");
            if ((int)a ==(int)b){
                System.out.println("Right");
                end = false;
            }

        }
    }
}
