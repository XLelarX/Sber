package com.company;

import java.util.Scanner;

public class Twelveth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double arr[] = new double[n];
        boolean end = true;
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random() * 100;
        }
        while (end) {
            menu();
            System.out.print("Введите номер команды : ");
            int j = in.nextInt();
            switch (j){
                case 1: {
                    for (int i = 0; i < n; i++) {
                        System.out.println(arr[i]);
                    }
                    break;
                }
                case 2: {
                    System.out.print("Введите номер элемента : ");
                    int k = in.nextInt();
                    arr[k - 1] *= 1.1;
                    break;
                }
                case 3: {
                    end = false;
                    break;
                }
            }
        }
    }

    private static void menu() {
        System.out.println("1.Вывести массив\n2.Увеличить элемент массива на 10%\n3.Выход");
    }
}
