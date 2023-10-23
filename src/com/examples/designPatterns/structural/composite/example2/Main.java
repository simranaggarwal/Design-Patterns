package com.examples.designPatterns.structural.composite.example2;

public class Main {
    public static void main(String[] args) {
        Panel panel1 = new Panel("panel1");
        GUIComponent button1 = new Button("buttonOfPanel1");
        GUIComponent textField1 = new TextField("textOfPanel1");
        panel1.addComponent(button1);
        panel1.addComponent(textField1);

        Panel panel2 = new Panel("panel2");
        GUIComponent button2 = new Button("buttonOfPanel2");
        GUIComponent textField2 = new TextField("textOfPanel1");
        panel2.addComponent(button2);
        panel2.addComponent(textField2);

        Panel panel3 = new Panel("panel3");
        panel3.addComponent(panel1);
        panel3.addComponent(panel2);

        /*
        Rendering panel: panel3
        Rendering panel: panel1
        Rendering button: buttonOfPanel1
        Rendering text field textOfPanel1
        Rendering panel: panel2
        Rendering button: buttonOfPanel2
        Rendering text field textOfPanel1
         */
        panel3.render();

    }
}
