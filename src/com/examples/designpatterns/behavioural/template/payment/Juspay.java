package com.examples.designpatterns.behavioural.template.payment;

//Concrete Class
public class Juspay extends PaymentGatewayService {

    //Implements primitive operations
    @Override
    protected void processPayment() {
        System.out.println("Processing Payment through Juspay");
    }
}
