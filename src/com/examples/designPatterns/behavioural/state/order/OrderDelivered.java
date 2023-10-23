package com.examples.designPatterns.behavioural.state.order;

//Concrete State
public class OrderDelivered implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Order is delivered.");
    }

    @Override
    public void changeState(Order order) {
        return;
    }
}
