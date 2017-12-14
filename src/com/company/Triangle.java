package com.company;

public class Triangle implements Figure {
    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private double a;

     private double b;

    @Override
    public double getPerimeter() {
         return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));


    }

    @Override
    public double getArea() {
        return 0.5*a*b;

    }

    @Override
    public String getType() {
        return "Triangle";
    }
}
