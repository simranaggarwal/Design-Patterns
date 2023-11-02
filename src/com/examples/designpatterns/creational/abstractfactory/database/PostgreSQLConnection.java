package com.examples.designpatterns.creational.abstractfactory.database;

//Concrete Product A
public class PostgreSQLConnection implements Connection {
    @Override
    public void openConnection() {
        System.out.println("Opening postgreSQL connection");
    }
    @Override
    public void closeConnection() {
        System.out.println("Closing postgreSQL connection");
    }
}
