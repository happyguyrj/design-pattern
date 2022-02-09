package com.example.factory.creational.factory.guiApp.factory;

import com.example.factory.creational.factory.guiApp.domain.Button;
import com.example.factory.creational.factory.guiApp.domain.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
