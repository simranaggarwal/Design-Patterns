package com.examples.designPatterns.creational.factory;

public class CSVClient implements ReportingClient {
    @Override
    public String transform(String data) {
        return data.toUpperCase() + ".csv";
    }
}
