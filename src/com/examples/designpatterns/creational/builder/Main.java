package com.examples.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        SMS sms = SMS.getSMSBuilder().setTo("9871").setFrom("9871").setContent("Hello World").build();

        //SMS{to='9871', from='9871', content='Hello World'}
        System.out.println(sms);
    }
}
