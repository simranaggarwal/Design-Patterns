package com.examples.designpatterns.structural.facade;

import java.math.BigDecimal;

//Facade
public class OrderFacade {

    //Other Interfaces related to Order
    private OrderReturnedService orderReturnedService;

    private OrderCancelService orderCancelService;

    boolean isOrderDelivered(Order order) {
        //Some complex logic on Order
        return true;
    }

    boolean isOrderCancelled(Order order) {
        //Some complex logic on Order
        return false;
    }

    boolean isOrderReturned(Order order) {
        //Some complex logic on Order
        return false;
    }

    boolean isPrepaidOrder(Order order) {
        //Some complex logic on Order
        return true;
    }

    boolean isCodOrder(Order order) {
        //Some complex logic on Order
        return false;
    }

    BigDecimal getTotalPrice(Order order) {
        //Some complex logic on Order
        return BigDecimal.ZERO;
    }

    BigDecimal getDiscount(Order order) {
        //Some complex logic on Order
        return BigDecimal.ZERO;
    }

}
