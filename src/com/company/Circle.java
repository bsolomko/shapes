package com.company;

import java.util.Objects;

public class Circle extends Shape{
    private double cenX;
    private  double centY;
    private  double radius;

    public Circle(double cenX, double centY, double radius,String color) {
        super(color);
        this.cenX = cenX;
        this.centY = centY;
        this.radius = radius;
    }

    @Override
     public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "cenX=" + cenX +
                ", centY=" + centY +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.cenX, cenX) == 0 && Double.compare(circle.centY, centY) == 0 && Double.compare(circle.radius, radius) == 0;
    }





}
