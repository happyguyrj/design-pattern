package com.example.factory.guiApp.app;

import com.example.factory.guiApp.domain.buttons.Button;
import com.example.factory.guiApp.domain.checkboxes.Checkbox;
import com.example.factory.guiApp.factory.GuiFactory;

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
