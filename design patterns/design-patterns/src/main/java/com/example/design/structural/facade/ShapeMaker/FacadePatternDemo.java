package com.example.design.structural.facade.ShapeMaker;

import com.example.design.structural.facade.ShapeMaker.facade.ShapeMaker;

public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
