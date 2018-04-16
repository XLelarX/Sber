package com.company;

import java.util.Scanner;

public class CalculationSum {
    private static final String ENTER_NUMBER_FOR_CALCULATION = "Введите число для подсчета суммы : ";
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print(ENTER_NUMBER_FOR_CALCULATION);
        Integer numberForCalculation = input.nextInt();

        int i = 0;
        int sum = 0;

        while (i < numberForCalculation.toString().length()) {
            sum += (int) numberForCalculation.toString().charAt(i) - '0';
            i++;
        }

        System.out.println(sum);
    }
}
