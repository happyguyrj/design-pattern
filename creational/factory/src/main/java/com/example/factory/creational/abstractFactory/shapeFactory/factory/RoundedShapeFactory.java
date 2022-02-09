package com.example.factory.creational.abstractFactory.shapeFactory.factory;

import com.example.factory.creational.abstractFactory.shapeFactory.shape.RoundedRectangle;
import com.example.factory.creational.abstractFactory.shapeFactory.shape.RoundedSquare;
import com.example.factory.creational.abstractFactory.shapeFactory.shape.Shape;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
