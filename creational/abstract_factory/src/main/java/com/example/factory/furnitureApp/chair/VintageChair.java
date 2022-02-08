package com.example.factory.furnitureApp.chair;

public class VintageChair implements Chair {

    public VintageChair() {
        System.out.println("Vintage chair");
    }

    @Override
    public int capacity() {
        return 1;
    }
}
