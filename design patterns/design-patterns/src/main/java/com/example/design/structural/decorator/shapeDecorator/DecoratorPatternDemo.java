package com.example.design.structural.decorator.shapeDecorator;

import com.example.design.structural.decorator.shapeDecorator.decorators.RedShapeDecorator;
import com.example.design.structural.decorator.shapeDecorator.shape.Circle;
import com.example.design.structural.decorator.shapeDecorator.shape.Rectangle;
import com.example.design.structural.decorator.shapeDecorator.shape.Shape;

public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}
