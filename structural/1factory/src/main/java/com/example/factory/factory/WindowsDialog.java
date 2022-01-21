package com.example.factory.factory;

import com.example.factory.domain.Button;
import com.example.factory.domain.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
