package com.examples.designpatterns.creational.abstractfactory.database;

//Concrete Product B
public class PostgreSQLQuery implements Query {
    @Override
    public Object executeQuery(String query) {
        System.out.println("Executing postgreSQL query...");
        return "User{id='1001',name='Cersie'}";
    }
}
