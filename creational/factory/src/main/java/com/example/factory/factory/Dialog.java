package com.example.factory.factory;

import com.example.factory.domain.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
