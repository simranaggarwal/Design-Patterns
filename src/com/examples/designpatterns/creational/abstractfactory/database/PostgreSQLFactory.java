package com.examples.designpatterns.creational.abstractfactory.database;

//Concrete Factory
//Responsible for creating a family of related objects
public class PostgreSQLFactory implements DatabaseFactory {

    //Product A
    @Override
    public Connection createConnection(String connectionString) {
        return new PostgreSQLConnection();
    }

    //Product B
    @Override
    public Query createQuery() {
        return new PostgreSQLQuery();
    }
}
