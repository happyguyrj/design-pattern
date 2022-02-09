package com.example.factory.creational.abstractFactory.guiApp.app;

import com.example.factory.creational.abstractFactory.guiApp.domain.buttons.Button;
import com.example.factory.creational.abstractFactory.guiApp.domain.checkboxes.Checkbox;
import com.example.factory.creational.abstractFactory.guiApp.factory.GuiFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
