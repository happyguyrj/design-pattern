package com.example.factory.app;

import com.example.factory.domain.buttons.Button;
import com.example.factory.domain.checkboxes.Checkbox;
import com.example.factory.factory.GuiFactory;

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
