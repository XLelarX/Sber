package com.company;

public class AllSimpleNumbers {
    private static final int maxInteger = 100;
    private static final int minInteger = 2;

    public static void main(String[] args) {

        for (int j = minInteger; j <= maxInteger; j++) {
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
