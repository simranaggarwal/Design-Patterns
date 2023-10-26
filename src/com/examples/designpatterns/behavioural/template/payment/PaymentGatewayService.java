package com.examples.designpatterns.behavioural.template.payment;

//Abstract Class
public abstract class PaymentGatewayService {
    protected void validateCart() {
        //Logic to validate cart
        System.out.println("Validating Cart");
    }

    //Making other methods "protected" to enforce clients to call handlePayment().
    //Although making methods "protected" or "public" depends on the use case. Pattern doesn't specify any such rule
    //Template method defining skeleton
    public void handlePayment() {
        validateCart();
        processPayment();
    }

    //Primitive Operation
    protected abstract void processPayment();
}
