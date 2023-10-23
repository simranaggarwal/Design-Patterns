package com.examples.designPatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        ReportingClient pdfClient = ReportingFactory.getReportingClient(ReportingTypes.PDF);
        //HELLO WORLD.pdf
        System.out.println(pdfClient.transform("Hello World"));

        ReportingClient csvClient = ReportingFactory.getReportingClient(ReportingTypes.CSV);
        //HELLO WORLD.csv
        System.out.println(csvClient.transform("Hello World"));
    }
}
