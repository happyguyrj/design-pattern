package com.example.factory.creational.abstractFactory.shapeFactory.factory;

import com.example.factory.creational.abstractFactory.shapeFactory.shape.Shape;

public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);
}
