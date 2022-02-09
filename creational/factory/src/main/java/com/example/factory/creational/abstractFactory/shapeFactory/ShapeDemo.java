package com.example.factory.creational.abstractFactory.shapeFactory;

import com.example.factory.creational.abstractFactory.shapeFactory.factory.AbstractFactory;
import com.example.factory.creational.abstractFactory.shapeFactory.factory.FactoryProducer;
import com.example.factory.creational.abstractFactory.shapeFactory.shape.Shape;

public class ShapeDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
    }
}
