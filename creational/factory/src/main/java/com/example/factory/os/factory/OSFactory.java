package com.example.factory.os.factory;

import com.example.factory.os.domain.AndroidOS;
import com.example.factory.os.domain.IOS;
import com.example.factory.os.domain.OS;
import com.example.factory.os.domain.WindowsOS;

public class OSFactory {

    public OS getOS(String name) {
        switch (name) {
            case "IOS": return new IOS();
            case "Android": return new AndroidOS();
            default: return new WindowsOS();
        }
    }
}
