package com.company;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(12,10,5,"Red"),
                new Rectangle("Red",2,2,4,4,4,4,12,12)

        };

        Shape circle =  new Circle(12,10,5,"Red");
        for(Shape shape:shapes){
            shape.draw();
        }

        System.out.println(shapes[0].equals(circle));

    }
}
