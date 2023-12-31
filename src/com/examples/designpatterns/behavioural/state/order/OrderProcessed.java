package com.examples.designpatterns.behavioural.state.order;

//Concrete State
public class OrderProcessed implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Order is processed.");
    }

    @Override
    public void changeState(Order order) {
        order.setOrderState(new OrderShipped());
    }
}
