package com.example.factory.guiApp.factory;

import com.example.factory.guiApp.domain.buttons.Button;
import com.example.factory.guiApp.domain.buttons.WindowsButton;
import com.example.factory.guiApp.domain.checkboxes.Checkbox;
import com.example.factory.guiApp.domain.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
