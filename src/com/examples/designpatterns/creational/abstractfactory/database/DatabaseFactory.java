package com.examples.designpatterns.creational.abstractfactory.database;

//Abstract Factory
//Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
public interface DatabaseFactory {

    //Create Product A
    Connection createConnection(String connectionString);

    //Create Product B
    Query createQuery();

}
