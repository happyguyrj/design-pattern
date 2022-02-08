package com.example.factory.furnitureApp.factory;

import com.example.factory.furnitureApp.chair.Chair;
import com.example.factory.furnitureApp.sofa.Sofa;
import com.example.factory.furnitureApp.table.Table;

public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();

    Table createTable();

}
