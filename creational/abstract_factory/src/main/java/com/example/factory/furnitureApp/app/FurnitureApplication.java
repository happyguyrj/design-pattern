package com.example.factory.furnitureApp.app;

import com.example.factory.furnitureApp.factory.FurnitureFactory;
import com.example.factory.furnitureApp.factory.ModernFurnitureFactory;
import com.example.factory.furnitureApp.factory.VintageFurnitureFactory;

public class FurnitureApplication {

    public FurnitureFactory getInstance(String instance) {
        switch (instance) {
            case "modern": return new ModernFurnitureFactory();
            default: return new VintageFurnitureFactory();
        }
    }
}
