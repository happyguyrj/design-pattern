package com.example.factory.furnitureApp.factory;

import com.example.factory.furnitureApp.chair.Chair;
import com.example.factory.furnitureApp.chair.VintageChair;
import com.example.factory.furnitureApp.sofa.Sofa;
import com.example.factory.furnitureApp.sofa.VintageSofa;
import com.example.factory.furnitureApp.table.Table;
import com.example.factory.furnitureApp.table.VintageTable;

public class VintageFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Sofa createSofa() {
        return new VintageSofa();
    }

    @Override
    public Table createTable() {
        return new VintageTable();
    }
}
