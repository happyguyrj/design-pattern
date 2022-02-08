package com.example.factory.furnitureApp;

import com.example.factory.furnitureApp.app.Application;
import com.example.factory.furnitureApp.app.FurnitureApplication;
import com.example.factory.furnitureApp.factory.FurnitureFactory;

public class FurnitureApp {

    public static void main(String[] args) {
        FurnitureApplication furnitureApplication = new FurnitureApplication();
        FurnitureFactory factory = furnitureApplication.getInstance("modern");

        Application application = new Application(factory);
    }
}
