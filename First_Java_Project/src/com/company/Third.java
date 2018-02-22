package com.company;

import java.util.Scanner;

public class Third{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для проверки на палиндром : ");
        int a = in.nextInt();
        String str = "" + a;
        int i = 0, j = 0;
        while (i < str.length()) {
            j++;
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                break;
            }
            i++;
        }
        if (j == str.length())
            System.out.println("Палиндром");
        else
            System.out.println("Не палиндром");
    }
}
