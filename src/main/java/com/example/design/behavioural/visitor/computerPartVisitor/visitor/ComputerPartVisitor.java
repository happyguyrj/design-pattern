package com.example.design.behavioural.visitor.computerPartVisitor.visitor;

import com.example.design.behavioural.visitor.computerPartVisitor.computerPart.Computer;
import com.example.design.behavioural.visitor.computerPartVisitor.computerPart.Keyboard;
import com.example.design.behavioural.visitor.computerPartVisitor.computerPart.Monitor;
import com.example.design.behavioural.visitor.computerPartVisitor.computerPart.Mouse;

public interface ComputerPartVisitor {

    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
    void visit(Computer computer);
}
