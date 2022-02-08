package com.example.factory.guiApp.factory;

import com.example.factory.guiApp.domain.buttons.Button;
import com.example.factory.guiApp.domain.buttons.MacOsButton;
import com.example.factory.guiApp.domain.checkboxes.Checkbox;
import com.example.factory.guiApp.domain.checkboxes.MacOsCheckbox;

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
