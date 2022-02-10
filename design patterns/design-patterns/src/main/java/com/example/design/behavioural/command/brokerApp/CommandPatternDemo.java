package com.example.design.behavioural.command.brokerApp;

import com.example.design.behavioural.command.brokerApp.domain.Stock;
import com.example.design.behavioural.command.brokerApp.order.BuyStock;
import com.example.design.behavioural.command.brokerApp.order.SellStock;

public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
