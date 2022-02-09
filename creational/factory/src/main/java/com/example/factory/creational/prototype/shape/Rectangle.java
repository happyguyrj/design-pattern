package com.example.factory.creational.prototype.shape;

import java.util.Objects;

public class Rectangle extends Shape {

    public int length;
    public int width;

    public Rectangle() {

    }

    public Rectangle(Rectangle target) {
        if (target != null) {
            this.length = target.length;
            this.width = target.width;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width);
    }
}
