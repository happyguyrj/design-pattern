package com.example.design.structural.decorator.shapeDecorator.decorators;

import com.example.design.structural.decorator.shapeDecorator.shape.Shape;

public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
