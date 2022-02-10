package com.example.design.behavioural.command.brokerApp.order;

import com.example.design.behavioural.command.brokerApp.domain.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}