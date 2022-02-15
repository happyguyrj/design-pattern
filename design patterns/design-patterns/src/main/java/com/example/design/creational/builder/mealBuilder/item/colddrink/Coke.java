package com.example.design.creational.builder.mealBuilder.item.colddrink;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10f;
    }
}
