package com.example.factory.os.domain;

public class WindowsOS implements OS {

    @Override
    public void spec() {
        System.out.println("Windows");
    }
}
