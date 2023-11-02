package com.examples.designpatterns.creational.abstractfactory.database;

//Concrete Product B
public class MySQLQuery implements Query {
    @Override
    public Object executeQuery(String query) {
        System.out.println("Executing mySQL query...");
        return "User{id='1001',name='Tyrion'}";
    }
}
