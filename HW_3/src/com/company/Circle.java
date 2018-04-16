package com.company;

public class Circle implements Figure {
    private static final String RADIUS = "Радиус : ";
    private static final String CENTER = " Центр : ";
    private double radius;
    private Point center;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getLengthOfCircle() {
        return 2 * Math.PI * radius;
    }

    public void randomMove() {
        center.setX(99 - Math.random() * 198);
        center.setY(99 - Math.random() * 198);
    }

    public double getLengthBetweenCenters(Circle second) {
        return center.getLengthBetweenPoints(second.getCenter());
    }

    public boolean isCirclesTouch(Circle second) {
        return getLengthBetweenCenters(second) == radius + second.getRadius() || getLengthBetweenCenters(second) == Math.abs(radius - second.getRadius());
    }

    public boolean hasAnInteriorPoint(Point point) {
        return center.getLengthBetweenPoints(point) <= radius;
    }

    public boolean hasAnInteriorCircle(Circle second) {
        return getLengthBetweenCenters(second) <= Math.abs(radius - second.getRadius());
    }

    @Override
    public void show() {
        System.out.println(RADIUS + radius + CENTER + center.toString());
    }

    @Override
    public void move(double x, double y) {
        center.setX(center.getX() + x);
        center.setY(center.getY() + y);
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }
}
