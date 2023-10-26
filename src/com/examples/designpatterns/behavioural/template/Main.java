package com.examples.designpatterns.behavioural.template;

import com.examples.designpatterns.behavioural.template.payment.Juspay;
import com.examples.designpatterns.behavioural.template.payment.PayU;
import com.examples.designpatterns.behavioural.template.payment.PaymentGatewayService;

public class Main {
    public static void main(String[] args) {
        PaymentGatewayService payU = new PayU();
        PaymentGatewayService juspay = new Juspay();

        /*
        Validating Cart
        Processing Payment through PayU
         */
        payU.handlePayment();

        System.out.println();

        /*
        Validating Cart
        Processing Payment through Juspay
         */
        juspay.handlePayment();
    }
}
