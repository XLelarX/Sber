package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Triangle a = new Triangle(new Point(1, 2), new Point(2, 3), new Point(3, 6));
        a.show();
        System.out.println(a.getFirst().getLengthBetweenPoints(a.getSecond()));
        System.out.println(a.getSecond().getLengthBetweenPoints(a.getThird()));
        System.out.println(a.getThird().getLengthBetweenPoints(a.getFirst()));
        System.out.println(a.getPerimeter());
        System.out.println(a.getSquare());
    }
}

