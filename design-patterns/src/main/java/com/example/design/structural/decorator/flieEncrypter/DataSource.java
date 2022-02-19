package com.example.design.structural.decorator.flieEncrypter;

public interface DataSource {

    void writeData(String data);

    String readData();
}
