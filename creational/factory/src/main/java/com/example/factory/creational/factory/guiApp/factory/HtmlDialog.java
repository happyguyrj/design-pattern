package com.example.factory.creational.factory.guiApp.factory;

import com.example.factory.creational.factory.guiApp.domain.HtmlButton;
import com.example.factory.creational.factory.guiApp.domain.Button;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
