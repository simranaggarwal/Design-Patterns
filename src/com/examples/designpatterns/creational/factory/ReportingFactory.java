package com.examples.designpatterns.creational.factory;

enum ReportingTypes {
    PDF,
    CSV
}
public class ReportingFactory {
    public static ReportingClient getReportingClient(ReportingTypes reportingTypes) {
        if(reportingTypes.equals(ReportingTypes.CSV)) {
            return new CSVClient();
        } else {
            return new PDFClient();
        }
    }
}
