package com.example.factory.furnitureApp.factory;

import com.example.factory.furnitureApp.chair.Chair;
import com.example.factory.furnitureApp.chair.ModernChair;
import com.example.factory.furnitureApp.sofa.ModernSofa;
import com.example.factory.furnitureApp.sofa.Sofa;
import com.example.factory.furnitureApp.table.ModernTable;
import com.example.factory.furnitureApp.table.Table;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
