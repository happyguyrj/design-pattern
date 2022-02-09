package com.example.factory.creational.factory.guiApp.factory;

import com.example.factory.creational.factory.guiApp.domain.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
