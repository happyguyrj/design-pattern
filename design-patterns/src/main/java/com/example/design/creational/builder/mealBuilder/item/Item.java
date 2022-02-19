package com.example.design.creational.builder.mealBuilder.item;

import com.example.design.creational.builder.mealBuilder.packing.Packing;

public interface Item {

    String name();

    Packing packing();

    float price();
}
