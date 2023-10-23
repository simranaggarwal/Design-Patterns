package com.examples.designpatterns.behavioural.state.order;

//Context
public class Order {
    OrderState orderState;

    public Order() {
        this.orderState = new OrderConfirmed();
    }

    void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void changeOrderState() {
        orderState.changeState(this);
    }

    public void showState() {
        orderState.handle(this);
    }


}
