package com.example.design.creational.singleton.singleton1;

public class SingleThreadedSingleton {

    private static SingleThreadedSingleton instance;
    public String value;

    private SingleThreadedSingleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingleThreadedSingleton getInstance(String value) {
        if (instance == null) {
            instance = new SingleThreadedSingleton(value);
        }
        return instance;
    }
}
