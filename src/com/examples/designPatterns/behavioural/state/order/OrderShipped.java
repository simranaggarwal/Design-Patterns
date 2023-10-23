package com.examples.designPatterns.behavioural.state.order;

//Concrete State
public class OrderShipped implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Order is shipped.");
    }

    @Override
    public void changeState(Order order) {
        order.setOrderState(new OrderDelivered());
    }
}
