package com.company;

import java.util.Scanner;

public class Complex {
    private double x, y;
    public Complex(){

    }
    public Complex(String str){
        reset(str);
    }

    private void reset(String str){
        int i = 0;
        char arr[] = str.toCharArray();
        String strb = "";
        while (arr[i] != '+' && arr[i] != '-') {
            if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.')
                strb += arr[i];
            i++;
        }
        if (arr[i] == '+')
            x = Double.parseDouble(strb);
        else
            x = -Double.parseDouble(strb);

        i++;
        strb = "";

        while (arr[i] != 'i') {
            if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.')
                strb += arr[i];
            i++;
        }
        y = Double.parseDouble(strb);

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

    public Complex add(Complex second){
        Complex res = new Complex();
        res.setX(x + second.getX());
        res.setY(y + second.getY());
        return res;
    }

    public Complex dif(Complex second){
        Complex res = new Complex();
        res.setX(x - second.getX());
        res.setY(y - second.getY());
        return res;
    }

    public Complex mul(Complex second){
        Complex res = new Complex();
        res.setX(x*second.getX() - y*second.getY());
        res.setY(x*second.getY() + y*second.getX());
        return res;
    }

    public String toString(){
        return this.x + "+" + this.y + "i";
    }
}
