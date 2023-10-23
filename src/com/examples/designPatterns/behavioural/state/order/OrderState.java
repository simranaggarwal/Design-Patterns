package com.examples.designPatterns.behavioural.state.order;

//State
public interface OrderState {

    public void handle(Order order);

    public void changeState(Order order);

}
