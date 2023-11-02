package com.examples.designpatterns.creational.abstractfactory;

import com.examples.designpatterns.creational.abstractfactory.database.*;

public class Main {
    public static void main(String[] args) {

        //The client code interacts with the abstract factory and the abstract product interfaces.
        //It does not need to be aware of the concrete classes.
        //The choice is made by selecting the appropriate concrete factory.
        DatabaseFactory mySQLFactory = new MySQLFactory();
        Connection connection1 = mySQLFactory.createConnection("jdbc:mysql://localhost:3306/users?user=root&password=root");
        Query query1 = mySQLFactory.createQuery();
        /*
        Opening mySQL connection
        Executing mySQL query...
        User{id='1001',name='Tyrion'}
        Closing mySQL connection
         */
        connection1.openConnection();
        Object data1 = query1.executeQuery("select * from users where id = 1001");
        System.out.println(data1);
        connection1.closeConnection();

        System.out.println();

        DatabaseFactory postgreSQLFactory = new PostgreSQLFactory();
        Connection connection2 = postgreSQLFactory.createConnection("jdbc:postgres://localhost:5432/users?user=root&password=root");
        Query query2 = postgreSQLFactory.createQuery();
        /*
        Opening postgreSQL connection
        Executing postgreSQL query...
        User{id='1001',name='Cersie'}
        Closing postgreSQL connection
         */
        connection2.openConnection();
        Object data2 = query2.executeQuery("select * from users where id = 1001");
        System.out.println(data2);
        connection2.closeConnection();

    }
}
