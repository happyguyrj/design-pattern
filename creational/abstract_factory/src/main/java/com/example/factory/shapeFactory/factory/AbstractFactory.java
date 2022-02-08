package com.example.factory.shapeFactory.factory;

import com.example.factory.shapeFactory.shape.Shape;

public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);
}
