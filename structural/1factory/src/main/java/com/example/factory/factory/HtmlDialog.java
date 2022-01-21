package com.example.factory.factory;

import com.example.factory.domain.Button;
import com.example.factory.domain.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
