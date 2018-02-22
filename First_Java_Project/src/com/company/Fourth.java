package com.company;

import java.util.Scanner;

public class Fourth{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для подсчета суммы : ");
        int a = in.nextInt();
        String str = "" + a;
        int i = 0, s = 0;
        while (i < str.length()){
            s += (int)str.charAt(i) - 48;
            i++;
        }
        System.out.println(s);
    }
}
