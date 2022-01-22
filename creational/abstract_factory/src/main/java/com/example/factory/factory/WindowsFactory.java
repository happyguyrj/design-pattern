package com.example.factory.factory;

import com.example.factory.domain.buttons.Button;
import com.example.factory.domain.buttons.WindowsButton;
import com.example.factory.domain.checkboxes.Checkbox;
import com.example.factory.domain.checkboxes.WindowsCheckbox;

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
