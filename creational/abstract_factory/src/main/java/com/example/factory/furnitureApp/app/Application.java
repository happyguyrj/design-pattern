package com.example.factory.furnitureApp.app;

import com.example.factory.furnitureApp.chair.Chair;
import com.example.factory.furnitureApp.factory.FurnitureFactory;
import com.example.factory.furnitureApp.sofa.Sofa;
import com.example.factory.furnitureApp.table.Table;
import com.example.factory.guiApp.domain.buttons.Button;
import com.example.factory.guiApp.domain.checkboxes.Checkbox;
import com.example.factory.guiApp.factory.GuiFactory;

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
