package com.example.design.creational.builder.mealBuilder;

import com.example.design.creational.builder.mealBuilder.item.burger.ChickenBurger;
import com.example.design.creational.builder.mealBuilder.item.burger.VegBurger;
import com.example.design.creational.builder.mealBuilder.item.colddrink.Coke;
import com.example.design.creational.builder.mealBuilder.item.colddrink.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
