package com.company;

import java.util.Objects;

public abstract class Shape {
    public Shape(String color) {
        this.color = color;
    }

   public abstract void draw();
    String color ;

    @Override
    public abstract boolean equals(Object o);

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
