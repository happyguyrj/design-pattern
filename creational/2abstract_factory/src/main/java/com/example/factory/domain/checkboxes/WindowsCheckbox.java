package com.example.factory.domain.checkboxes;

public class WindowsCheckbox implements Checkbox {

    public WindowsCheckbox() {
        System.out.println("You have created WindowsCheckbox.");
    }

    @Override
    public void paint() {
        System.out.println("You have painted WindowsCheckbox.");
    }
}
