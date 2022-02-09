package com.example.design.creational.abstractFactory.guiApp.factory;

import com.example.design.creational.abstractFactory.guiApp.domain.buttons.Button;
import com.example.design.creational.abstractFactory.guiApp.domain.checkboxes.Checkbox;

public interface GuiFactory {

    Button createButton();

    Checkbox createCheckbox();

}
