package com.example.factory.guiApp.factory;

import com.example.factory.guiApp.domain.Button;
import com.example.factory.guiApp.domain.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
