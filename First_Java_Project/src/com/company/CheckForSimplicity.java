package com.company;

import java.util.Scanner;

public class CheckForSimplicity {
    private static final String ENTER_NUMBER = "Введите число : ";
    private static final String IS_SIMPLE = "Простое";
    private static final String IS_COMPOSITE = "Составное";
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print(ENTER_NUMBER);
        int numberForCheck = input.nextInt();
        int i;

        for (i = numberForCheck; i > 1; i--) {
            if (numberForCheck % i == 0 && i != numberForCheck) {
                System.out.println(IS_COMPOSITE);
                break;
            }
        }
        if (i == 1)
            System.out.println(IS_SIMPLE);
    }
}
