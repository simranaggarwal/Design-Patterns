package com.examples.designpatterns.creational.factory;

public class PDFClient implements ReportingClient {
    @Override
    public String transform(String data) {
        return data.toUpperCase() + ".pdf";
    }
}
