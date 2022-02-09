package com.example.factory.creational.abstractFactory.furnitureApp.factory;

import com.example.factory.creational.abstractFactory.furnitureApp.chair.Chair;
import com.example.factory.creational.abstractFactory.furnitureApp.chair.VintageChair;
import com.example.factory.creational.abstractFactory.furnitureApp.sofa.Sofa;
import com.example.factory.creational.abstractFactory.furnitureApp.sofa.VintageSofa;
import com.example.factory.creational.abstractFactory.furnitureApp.table.Table;
import com.example.factory.creational.abstractFactory.furnitureApp.table.VintageTable;

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
