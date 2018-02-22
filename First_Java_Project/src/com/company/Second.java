package com.company;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean weekday = true, vocation  = false;
        boolean week[] = new boolean[7];
        for (int i = 0; i < 5; i++){
            week[i] = weekday;
            week[i] = !vocation;
        }
        week[4] = vocation;
        week[5] = !weekday;
        week[6] = !weekday;
        System.out.println("Введите номер дня от 1 до 7");
        int n = in.nextInt();
        if (week[n - 1] == !weekday || week[n - 1] == vocation){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
