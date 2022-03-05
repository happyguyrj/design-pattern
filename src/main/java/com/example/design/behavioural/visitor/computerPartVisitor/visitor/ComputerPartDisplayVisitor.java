package com.example.design.behavioural.visitor.computerPartVisitor.visitor;

import com.example.design.behavioural.visitor.computerPartVisitor.computerPart.Computer;
import com.example.design.behavioural.visitor.computerPartVisitor.computerPart.Keyboard;
import com.example.design.behavioural.visitor.computerPartVisitor.computerPart.Monitor;
import com.example.design.behavioural.visitor.computerPartVisitor.computerPart.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
