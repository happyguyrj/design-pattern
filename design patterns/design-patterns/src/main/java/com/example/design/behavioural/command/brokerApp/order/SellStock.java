package com.example.design.behavioural.command.brokerApp.order;

import com.example.design.behavioural.command.brokerApp.domain.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}