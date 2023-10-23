package com.examples.designpatterns.creational.builder;

public class SMS {

    private String to;
    private String from;
    private String content;
    private SMS() {}

    //private constructor to prevent object creation without using Builder
    private SMS(String to, String from, String content) {
        this.to = to;
        this.from = from;
        this.content = content;
    }

    public static SMSBuilder getSMSBuilder() {
        //Returning new SMSBuilder object to prevent multi-threading issues.
        return new SMSBuilder();
    }

    //Static so that SMS.getSMSBuilder() can be called and user not needing to create a new SMSBuilder object
    public static class SMSBuilder {
        private String to;
        private String from;
        private String content;

        //Returning SMSBuilder to allow chain style method calling
        public SMSBuilder setTo(String to) {
            this.to = to;
            return this;
        }

        public SMSBuilder setFrom(String from) {
            this.from = from;
            return this;
        }

        public SMSBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public SMS build() {
            return new SMS(to, from, content);
        }
    }

    @Override
    public String toString() {
        return "SMS{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
