package com.company;

import com.company.Figure;

public class Rectangle implements Figure {
private int a;
    private int b;


    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }




    @Override
    public double getPerimeter() {

        return  2*(a+b);


    }

    @Override
    public double getArea() {
        return  a*b;

    }

    @Override
    public String getType() {
        return "Rectangular";
    }
}
