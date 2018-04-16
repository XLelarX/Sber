package com.company;

import java.util.Scanner;

public class CalculationWeightOnMoon {
    private static final String ENTER_WEIGHT_ON_EARTH = "Введите вес объекта на Земле : ";
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(ENTER_WEIGHT_ON_EARTH);
        double weightOnEarth = input.nextDouble();

        System.out.println(weightOnEarth * 0.17);
    }
}
