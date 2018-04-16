package com.company;

public class Triangle implements Figure {
    private static final String COMMA = ", ";
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Point getFirst() {
        return first;
    }

    public void setFirst(Point first) {
        this.first = first;
    }

    public Point getSecond() {
        return second;
    }

    public void setSecond(Point second) {
        this.second = second;
    }

    public Point getThird() {
        return third;
    }

    public void setThird(Point third) {
        this.third = third;
    }

    public double getPerimeter() {
        return (getFirstSide() + getSecondSide() + getThirdSide());
    }

    @Override
    public void show() {
        System.out.println(first.toString() + COMMA + second.toString() + COMMA + third.toString());
    }

    @Override
    public void move(double x, double y) {

    }

    @Override
    public void scale(double factor) {

    }

    @Override
    public double getSquare() {
        double semiperimeter = getPerimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - getFirstSide()) * (semiperimeter - getSecondSide()) * (semiperimeter - getThirdSide()));
    }

    private double getThirdSide() {
        return third.getLengthBetweenPoints(first);
    }

    private double getSecondSide() {
        return second.getLengthBetweenPoints(third);
    }

    private double getFirstSide() {
        return first.getLengthBetweenPoints(second);
    }


}
