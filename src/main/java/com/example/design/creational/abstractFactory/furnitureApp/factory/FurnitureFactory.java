package com.example.design.creational.abstractFactory.furnitureApp.factory;

import com.example.design.creational.abstractFactory.furnitureApp.chair.Chair;
import com.example.design.creational.abstractFactory.furnitureApp.sofa.Sofa;
import com.example.design.creational.abstractFactory.furnitureApp.table.Table;

public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();

    Table createTable();

}
