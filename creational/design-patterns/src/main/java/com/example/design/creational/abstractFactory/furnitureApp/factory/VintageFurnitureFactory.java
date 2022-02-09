package com.example.design.creational.abstractFactory.furnitureApp.factory;

import com.example.design.creational.abstractFactory.furnitureApp.chair.Chair;
import com.example.design.creational.abstractFactory.furnitureApp.chair.VintageChair;
import com.example.design.creational.abstractFactory.furnitureApp.sofa.Sofa;
import com.example.design.creational.abstractFactory.furnitureApp.sofa.VintageSofa;
import com.example.design.creational.abstractFactory.furnitureApp.table.Table;
import com.example.design.creational.abstractFactory.furnitureApp.table.VintageTable;

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
