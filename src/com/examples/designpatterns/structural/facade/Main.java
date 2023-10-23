package com.examples.designpatterns.structural.facade;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(); //orderRepository.getOrderFromCode(code);
        OrderFacade facade = new OrderFacade(); //Could be static depending on the use case
        Boolean isCodOrder = facade.isCodOrder(order);
        BigDecimal discount = facade.getDiscount(order);
        System.out.println(isCodOrder + " " + discount);
    }
}
