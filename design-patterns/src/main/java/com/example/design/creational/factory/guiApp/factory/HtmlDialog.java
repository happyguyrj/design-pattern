package com.example.design.creational.factory.guiApp.factory;

import com.example.design.creational.factory.guiApp.domain.HtmlButton;
import com.example.design.creational.factory.guiApp.domain.Button;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
