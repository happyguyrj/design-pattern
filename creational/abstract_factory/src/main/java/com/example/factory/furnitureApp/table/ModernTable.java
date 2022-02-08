package com.example.factory.furnitureApp.table;

public class ModernTable implements Table {

    public ModernTable() {
        System.out.println("Modern Table");
    }

    @Override
    public int size() {
        return 10;
    }
}
