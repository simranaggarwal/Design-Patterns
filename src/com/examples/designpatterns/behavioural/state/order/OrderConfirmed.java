package com.examples.designpatterns.behavioural.state.order;

//Concrete State
public class OrderConfirmed implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Order is confirmed.");
    }

    @Override
    public void changeState(Order order) {
        order.setOrderState(new OrderProcessed());
    }
}
