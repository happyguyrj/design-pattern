package com.example.design.creational.abstractFactory.shapeFactory.factory;

import com.example.design.creational.abstractFactory.shapeFactory.shape.Shape;

public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);
}
