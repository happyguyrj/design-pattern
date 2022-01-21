package com.example.factory.factory;

import com.example.factory.domain.buttons.Button;
import com.example.factory.domain.buttons.MacOsButton;
import com.example.factory.domain.buttons.WindowsButton;
import com.example.factory.domain.checkboxes.Checkbox;
import com.example.factory.domain.checkboxes.MacOsCheckbox;
import com.example.factory.domain.checkboxes.WindowsCheckbox;

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
