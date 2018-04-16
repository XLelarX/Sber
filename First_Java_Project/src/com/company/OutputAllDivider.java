package com.company;

import java.util.Scanner;

public class OutputAllDivider {
    private static final String ENTER_NUMBER = "Введите число : ";
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(ENTER_NUMBER);
        int numberForCheck = input.nextInt();

        for (int i = numberForCheck; i > 0; i--) {
            if (numberForCheck % i == 0)
                System.out.println(i);
        }

    }
}
