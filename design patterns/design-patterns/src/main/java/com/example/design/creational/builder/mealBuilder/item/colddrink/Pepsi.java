package com.example.design.creational.builder.mealBuilder.item.colddrink;

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 15f;
    }
}
