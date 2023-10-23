package com.examples.designpatterns.behavioural.state;

import com.examples.designpatterns.behavioural.state.order.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.showState();
        //Order is confirmed.

        order.changeOrderState();
        order.showState();
        //Order is processed.

        order.changeOrderState();
        order.showState();
        //Order is shipped.

        order.changeOrderState();
        order.showState();
        //Order is delivered.

        order.changeOrderState();
        order.showState();
        //Order is delivered.

        order.changeOrderState();
        order.showState();
        //Order is delivered.
    }
}
