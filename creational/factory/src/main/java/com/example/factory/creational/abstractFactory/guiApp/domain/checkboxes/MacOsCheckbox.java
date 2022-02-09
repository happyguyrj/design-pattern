package com.example.factory.creational.abstractFactory.guiApp.domain.checkboxes;

public class MacOsCheckbox implements Checkbox {

    public MacOsCheckbox() {
        System.out.println("You have created MacOsCheckbox.");
    }

    @Override
    public void paint() {
        System.out.println("You have painted MacOsCheckbox.");
    }
}
