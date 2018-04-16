package com.company;

import java.util.Scanner;

public class CheckForPalindrome {
    private static final String ENTER_NUMBER_FOR_CHECK = "Введите число для проверки на палиндром : ";
    private static final String IS_PALINDROME = "Палиндром";
    private static final String IS_NOT_PALINDROME = "Не палиндром";
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(ENTER_NUMBER_FOR_CHECK);
        Integer numberForCheck = input.nextInt();

        int i = 0;

        while (i < numberForCheck.toString().length()) {
            if (numberForCheck.toString().charAt(i) != numberForCheck.toString().charAt(numberForCheck.toString().length() - 1 - i)) {
                System.out.println(IS_NOT_PALINDROME);
                break;
            }
            i++;
            if (i == numberForCheck.toString().length())
                System.out.println(IS_PALINDROME);
        }
    }
}
