package com.example.design.structural.decorator.flieEncrypter.decorators;

import com.example.design.structural.decorator.flieEncrypter.DataSource;

public class DatasourceDecorator implements DataSource {

    private DataSource wrapper;

    DatasourceDecorator(DataSource source) {
        this.wrapper = source;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
