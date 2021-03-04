package com.company;

import java.util.Objects;

public class Rectangle extends Shape {
private double x1,x2,x3,x4,y1,y2,y3,y4;

    public Rectangle(String color, double x1,
                     double x2, double x3, double x4, double y1,
                     double y2, double y3, double y4) {
        super(color);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.x1, x1) == 0 && Double.compare(rectangle.x2, x2) == 0 && Double.compare(rectangle.x3, x3) == 0 && Double.compare(rectangle.x4, x4) == 0 && Double.compare(rectangle.y1, y1) == 0 && Double.compare(rectangle.y2, y2) == 0 && Double.compare(rectangle.y3, y3) == 0 && Double.compare(rectangle.y4, y4) == 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                ", x4=" + x4 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", y3=" + y3 +
                ", y4=" + y4 +
                ", color='" + color + '\'' +
                '}';
    }
}
