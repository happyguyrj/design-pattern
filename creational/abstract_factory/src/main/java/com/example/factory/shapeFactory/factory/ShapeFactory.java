package com.example.factory.shapeFactory.factory;

import com.example.factory.shapeFactory.shape.Rectangle;
import com.example.factory.shapeFactory.shape.Shape;
import com.example.factory.shapeFactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
