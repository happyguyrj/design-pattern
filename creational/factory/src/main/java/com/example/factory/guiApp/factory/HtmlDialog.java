package com.example.factory.guiApp.factory;

import com.example.factory.guiApp.domain.Button;
import com.example.factory.guiApp.domain.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
