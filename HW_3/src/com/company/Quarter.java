package com.company;

public enum Quarter {
    FIRST, SECOND, THIRD, FOURTH;

    Quarter() {
    }

    public static Quarter getQuarter(double x, double y) {
        if (x > 0 && y > 0)
            return FIRST;
        else if (x < 0 && y > 0)
            return SECOND;
        else if (x < 0 && y < 0)
            return THIRD;
        else if (x > 0 && y < 0)
            return FOURTH;
        else return null;
    }

}