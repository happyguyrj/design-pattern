package com.example.factory.os.domain;

public class AndroidOS implements OS {

    @Override
    public void spec() {
        System.out.println("Android");
    }
}
