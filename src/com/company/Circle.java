package com.company;

public class Circle implements Figure {

    public Circle (int r) {
        this.r=r;
    }



    private int r;
     @Override



    public double getPerimeter() {
        return  2*Math.PI*r;

    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(r,2);


    }

    @Override
    public String getType() {
        return "Circle";
    }

}
