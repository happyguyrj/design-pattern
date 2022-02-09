package com.example.factory.creational.abstractFactory.furnitureApp.app;

import com.example.factory.creational.abstractFactory.furnitureApp.chair.Chair;
import com.example.factory.creational.abstractFactory.furnitureApp.factory.FurnitureFactory;
import com.example.factory.creational.abstractFactory.furnitureApp.sofa.Sofa;
import com.example.factory.creational.abstractFactory.furnitureApp.table.Table;

public class Application {

    private Chair chair;
    private Sofa sofa;
    private Table table;

    public Application(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createTable();
    }
}
