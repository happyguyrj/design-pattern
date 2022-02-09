package com.example.factory.creational.abstractFactory.furnitureApp.sofa;

public class ModernSofa implements Sofa {

    public ModernSofa() {
        System.out.println("Modern sofa");
    }

    @Override
    public int capacity() {
        return 3;
    }
}
