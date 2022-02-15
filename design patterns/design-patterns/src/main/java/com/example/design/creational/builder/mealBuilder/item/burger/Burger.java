package com.example.design.creational.builder.mealBuilder.item.burger;

import com.example.design.creational.builder.mealBuilder.item.Item;
import com.example.design.creational.builder.mealBuilder.packing.Packing;
import com.example.design.creational.builder.mealBuilder.packing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
