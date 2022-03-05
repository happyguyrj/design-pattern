package com.example.design.behavioural.visitor.computerPartVisitor.computerPart;

import com.example.design.behavioural.visitor.computerPartVisitor.visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
