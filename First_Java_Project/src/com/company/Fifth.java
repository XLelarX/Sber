package com.company;

import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вес объекта на Земле : ");
        double monEarth = in.nextDouble();
        System.out.println(monEarth * 0.17);
    }
}
