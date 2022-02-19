package com.example.design.creational.builder.mealBuilder.item.colddrink;

import com.example.design.creational.builder.mealBuilder.item.Item;
import com.example.design.creational.builder.mealBuilder.packing.Bottle;
import com.example.design.creational.builder.mealBuilder.packing.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
