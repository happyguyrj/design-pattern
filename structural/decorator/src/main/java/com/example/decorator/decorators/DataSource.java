package com.example.decorator.decorators;

public interface DataSource {

    void writeData(String data);

    String readData();
}
