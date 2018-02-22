package com.company;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 100;
        for (int j = 1;j < a + 1 ;j++) {
            int i = j - 1;
            for (; i > 1; i--) {
                if (j % i == 0 && i != j)
                    break;
            }
            if (i == 1)
                System.out.println(j);
        }
    }
}
