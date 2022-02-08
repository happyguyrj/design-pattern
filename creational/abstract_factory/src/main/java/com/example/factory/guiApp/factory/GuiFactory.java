package com.example.factory.guiApp.factory;

import com.example.factory.guiApp.domain.buttons.Button;
import com.example.factory.guiApp.domain.checkboxes.Checkbox;

public interface GuiFactory {

    Button createButton();

    Checkbox createCheckbox();

}
