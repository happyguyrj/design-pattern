package com.example.design.creational.abstractFactory.guiApp.factory;

import com.example.design.creational.abstractFactory.guiApp.domain.buttons.Button;
import com.example.design.creational.abstractFactory.guiApp.domain.buttons.MacOsButton;
import com.example.design.creational.abstractFactory.guiApp.domain.checkboxes.Checkbox;
import com.example.design.creational.abstractFactory.guiApp.domain.checkboxes.MacOsCheckbox;

public class MacOsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
