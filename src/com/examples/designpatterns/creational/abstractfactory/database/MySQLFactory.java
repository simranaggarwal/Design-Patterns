package com.examples.designpatterns.creational.abstractfactory.database;

//Concrete factory
//Responsible for creating a family of related objects
public class MySQLFactory implements DatabaseFactory {

    //Product A
    @Override
    public Connection createConnection(String connectionString) {
        return new MySQLConnection();
    }
    //Product B
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
