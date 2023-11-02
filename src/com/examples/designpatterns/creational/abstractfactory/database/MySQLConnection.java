package com.examples.designpatterns.creational.abstractfactory.database;

//Concrete Product A
public class MySQLConnection implements Connection {
    @Override
    public void openConnection() {
        System.out.println("Opening mySQL connection");
    }
    @Override
    public void closeConnection() {
        System.out.println("Closing mySQL connection");
    }
}
