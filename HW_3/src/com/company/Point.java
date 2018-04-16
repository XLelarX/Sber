package com.company;

public class Point {
    private double x;
    private double y;
    private static final int MAGIC_CONST = 1000;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Quarter getQuarter() {
        return Quarter.getQuarter(x, y);
    }

    public boolean isSymmetric(Point second) {
        return second.getX() == -x && second.getY() == -y;
    }

    public boolean isCollinear(Point second, Point third) {
        return 0 == ((x * second.getY() + second.getX() * third.getY() + third.getX() * y) - (second.getX() * y + third.getX() * second.getY() + x * third.getY())) / 2;
    }

    public double getLengthBetweenPoints(Point second) {
        double deltaX = second.getX() - x;
        double deltaY = second.getY() - y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public String toString() {
        return "(" + x + " : " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point second = (Point) o;
            return second.getX() == x && second.getY() == y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (Math.round(x) + Math.round(y) * MAGIC_CONST);
    }
}
