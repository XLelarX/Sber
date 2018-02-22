package com.company;

import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(),str1 = "";
        int n = in.nextInt();
        for (int i = 0; i < str.length(); i++) {
            if (i != n - 1)
                str1 += str.charAt(i);
        }
        System.out.println(str1);
    }
}
