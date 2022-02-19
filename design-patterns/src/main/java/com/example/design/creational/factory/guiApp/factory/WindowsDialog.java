package com.example.design.creational.factory.guiApp.factory;

import com.example.design.creational.factory.guiApp.domain.Button;
import com.example.design.creational.factory.guiApp.domain.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
