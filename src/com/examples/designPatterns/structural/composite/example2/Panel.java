package com.examples.designPatterns.structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Panel implements GUIComponent {

    String panelName;

    public Panel(String panelName) {
        this.panelName = panelName;
    }

    List<GUIComponent> componentList = new ArrayList<>();

    public void addComponent(GUIComponent component) {
        componentList.add(component);
    }
    @Override
    public void render() {
        System.out.println("Rendering panel: " + panelName);
        for(GUIComponent component: componentList) {
            component.render();
        }
    }
}
