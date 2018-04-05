package com.company;

public class Vector {
    double x;
    double y;
    double z;
    Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String toString(){
        return x + "i + " + y + "j + " + z + "k";
    }

    public Vector add(Vector second){
        return new Vector(this.x + second.getX(), this.y + second.getY(), this.z + second.getZ());
    }

    public Vector sub(Vector second){
        return new Vector(this.x - second.getX(), this.y - second.getY(), this.z - second.getZ());
    }
}
