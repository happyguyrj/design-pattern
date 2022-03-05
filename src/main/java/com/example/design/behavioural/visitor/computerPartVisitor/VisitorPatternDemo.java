package com.example.design.behavioural.visitor.computerPartVisitor;

import com.example.design.behavioural.visitor.computerPartVisitor.computerPart.Computer;
import com.example.design.behavioural.visitor.computerPartVisitor.computerPart.ComputerPart;
import com.example.design.behavioural.visitor.computerPartVisitor.visitor.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
