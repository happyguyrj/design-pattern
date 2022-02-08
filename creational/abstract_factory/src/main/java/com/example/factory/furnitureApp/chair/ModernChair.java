package com.example.factory.furnitureApp.chair;

public class ModernChair implements Chair {

    public ModernChair() {
        System.out.println("Modern chair");
    }

    @Override
    public int capacity() {
        return 1;
    }
}
