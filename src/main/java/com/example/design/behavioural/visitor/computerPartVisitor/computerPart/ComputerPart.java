package com.example.design.behavioural.visitor.computerPartVisitor.computerPart;

import com.example.design.behavioural.visitor.computerPartVisitor.visitor.ComputerPartVisitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);
}
