package com.example.decorator.decorators;

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
