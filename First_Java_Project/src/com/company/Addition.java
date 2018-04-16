package com.company;

import java.util.Scanner;

public class Addition {
    private static final String AND = " и ";
    private static final String DIVIDE_ON = "/";
    private static final String EQUALLY = " = ";
    private static final String IN_REMAIDER = "в остатке";
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        short firstNumber = input.nextShort();
        short secondNumber = input.nextShort();

        System.out.println(firstNumber + DIVIDE_ON + secondNumber + EQUALLY + firstNumber / secondNumber + AND + firstNumber % secondNumber + IN_REMAIDER);
    }
}
