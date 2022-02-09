package com.example.factory.creational.abstractFactory.furnitureApp.factory;

import com.example.factory.creational.abstractFactory.furnitureApp.chair.Chair;
import com.example.factory.creational.abstractFactory.furnitureApp.sofa.Sofa;
import com.example.factory.creational.abstractFactory.furnitureApp.table.Table;

public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();

    Table createTable();

}
