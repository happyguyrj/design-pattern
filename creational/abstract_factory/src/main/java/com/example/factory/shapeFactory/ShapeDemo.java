package com.example.factory.shapeFactory;

import com.example.factory.shapeFactory.factory.AbstractFactory;
import com.example.factory.shapeFactory.factory.FactoryProducer;
import com.example.factory.shapeFactory.shape.Shape;

public class ShapeDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
    }
}
