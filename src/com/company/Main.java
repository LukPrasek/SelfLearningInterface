package com.company;

import java.util.Scanner;

public class Main {
    int r;
    int a;
    int b;
    int c;
    int d;

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
	Scanner scanner = new Scanner (System.in);
        System.out.println("Give the radius: ");
        int r=scanner.nextInt();
        Circle circle=new Circle(r);
        figures[0]=circle;

        System.out.println("Give the triangle first side: ");
        int a = scanner.nextInt();
        System.out.println("Give the triangle second side: ");
        int b=scanner.nextInt();
        Triangle triangle=new Triangle(a,b);
        figures[1]=triangle;

        System.out.println("Give the rectangular first side: ");
        int c=scanner.nextInt();
        System.out.println("Give the rectangular second side: ");
        int d=scanner.nextInt();
        Rectangle rectangle=new Rectangle(c,d);
        figures[2]=rectangle;

for (Figure x: figures) {
    System.out.println(x.getType());
    System.out.println(x.getPerimeter());
    System.out.println(x.getArea());

}
    }
}
