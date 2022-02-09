package com.example.factory.creational.abstractFactory.furnitureApp.table;

public class VintageTable implements Table {

    public VintageTable() {
        System.out.println("Vintage Table");
    }

    @Override
    public int size() {
        return 10;
    }
}
