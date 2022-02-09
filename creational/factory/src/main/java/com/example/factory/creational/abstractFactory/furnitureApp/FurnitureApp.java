package com.example.factory.creational.abstractFactory.furnitureApp;

import com.example.factory.creational.abstractFactory.furnitureApp.app.Application;
import com.example.factory.creational.abstractFactory.furnitureApp.app.FurnitureApplication;
import com.example.factory.creational.abstractFactory.furnitureApp.factory.FurnitureFactory;

public class FurnitureApp {

    public static void main(String[] args) {
        FurnitureApplication furnitureApplication = new FurnitureApplication();
        FurnitureFactory factory = furnitureApplication.getInstance("modern");

        Application application = new Application(factory);
    }
}
