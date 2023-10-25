package com.examples.designpatterns.behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        CustomCollection<String> customCollection1 = new CustomCollection<>(5);
        customCollection1.addItem("a");
        customCollection1.addItem("b");
        customCollection1.addItem("c");
        customCollection1.addItem("d");
        customCollection1.addItem("e");
        customCollection1.addItem("f");
        customCollection1.addItem("g");
        customCollection1.addItem("h");
        customCollection1.addItem("i");
        customCollection1.addItem("j");

        CustomIterator<String> customIterator1 = customCollection1.createAndGetIterator();

        //a b c d e
        while(customIterator1.hasNext()) {
            String data = customIterator1.next();
            System.out.print(data + " ");
        }
        System.out.println();

        CustomCollection<Integer> customCollection2 = new CustomCollection<>(10);
        customCollection2.addItem(1);
        customCollection2.addItem(2);
        customCollection2.addItem(3);
        customCollection2.addItem(4);
        customCollection2.addItem(5);
        customCollection2.addItem(6);
        customCollection2.addItem(7);
        customCollection2.addItem(8);
        customCollection2.addItem(9);
        customCollection2.addItem(10);

        CustomIterator<Integer> customIterator2 = customCollection2.createAndGetIterator();

        //1 2 3 4 5 6 7 8 9 10
        while(customIterator2.hasNext()) {
            Integer data = customIterator2.next();
            System.out.print(data + " ");
        }
        System.out.println();

    }
}
