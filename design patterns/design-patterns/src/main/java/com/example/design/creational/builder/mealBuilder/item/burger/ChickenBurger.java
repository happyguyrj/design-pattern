package com.example.design.creational.builder.mealBuilder.item.burger;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
