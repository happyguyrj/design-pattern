package com.example.factory.creational.abstractFactory.guiApp.domain.buttons;

public class MacOsButton implements Button {

    public MacOsButton() {
        System.out.println("You have created MacOsButton.");
    }

    @Override
    public void paint() {
        System.out.println("You have painted MacOsButton.");
    }
}
