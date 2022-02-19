package com.example.design.creational.abstractFactory.furnitureApp.factory;

import com.example.design.creational.abstractFactory.furnitureApp.chair.Chair;
import com.example.design.creational.abstractFactory.furnitureApp.chair.ModernChair;
import com.example.design.creational.abstractFactory.furnitureApp.sofa.ModernSofa;
import com.example.design.creational.abstractFactory.furnitureApp.sofa.Sofa;
import com.example.design.creational.abstractFactory.furnitureApp.table.ModernTable;
import com.example.design.creational.abstractFactory.furnitureApp.table.Table;

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
