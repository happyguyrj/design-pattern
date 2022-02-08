package com.example.factory.furnitureApp.sofa;

public class VintageSofa implements Sofa {

    public VintageSofa() {
        System.out.println("Vintage sofa");
    }

    @Override
    public int capacity() {
        return 3;
    }
}
