package com.company;

import java.util.Scanner;

public class Weekdays {
    private static final String ENTER_DAY_OF_THE_WEEK = "Введите номер дня от 1 до 7";
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean week[] = new boolean[7];

        addWeekdaysInArray(week);
        addWeekendInArray(week);
        addHolidaysInArray(week);

        System.out.println(ENTER_DAY_OF_THE_WEEK);
        int numberOfDay = input.nextInt();

        if (!week[numberOfDay - 1] || !week[numberOfDay - 1]) {
            System.out.println(true);
        } else
            System.out.println(false);
    }

    private static void addHolidaysInArray(boolean[] week) {
        week[3] = false;
    }

    private static void addWeekdaysInArray(boolean[] week) {
        for (int i = 0; i < 5; i++) {
            week[i] = true;
        }
    }

    private static void addWeekendInArray(boolean[] week) {
        week[5] = false;
        week[6] = false;
    }
}
