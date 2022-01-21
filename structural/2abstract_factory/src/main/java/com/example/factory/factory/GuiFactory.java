package com.example.factory.factory;

import com.example.factory.domain.buttons.Button;
import com.example.factory.domain.checkboxes.Checkbox;

public interface GuiFactory {

    Button createButton();

    Checkbox createCheckbox();

}
