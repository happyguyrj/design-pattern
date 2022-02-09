package com.example.factory.creational.abstractFactory.guiApp.domain.buttons;

public class WindowsButton implements Button {

    public WindowsButton() {
        System.out.println("You have created WindowsButton.");
    }

    @Override
    public void paint() {
        System.out.println("You have painted WindowsButton.");
    }
}
