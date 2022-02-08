package com.example.factory.furnitureApp.sofa;

public class ModernSofa implements Sofa {

    public ModernSofa() {
        System.out.println("Modern sofa");
    }

    @Override
    public int capacity() {
        return 3;
    }
}
