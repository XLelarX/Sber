package com.company;

public class Vector {
    private double x;
    private double y;
    private double z;
    Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString(){
        char symboly = '+';
        char symbolz = '+';
        if (y < 0)
            symboly = '-';
        if (z < 0)
            symbolz = '-';
        return Math.abs(x) + "i" + symboly + Math.abs(y) + "j" + symbolz + Math.abs(z) + "k";
    }

    public Vector addition(Vector second){
        return new Vector(x + second.x, y + second.y, z + second.z);
    }

    public Vector substraction(Vector second){
        return new Vector(x - second.x, y - second.y, z - second.z);
    }

    public double scalarComposition(Vector second){
        return x*second.x + y*second.y + z*second.z;
    }

    public double getLength(){
        return Math.sqrt(x*x + y*y + z*z);
    }
}
