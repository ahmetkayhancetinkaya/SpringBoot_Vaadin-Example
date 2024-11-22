package org.vaadin.example;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
public class MainView extends Div {
    public MainView() {
        setText("Welcome to the main view!");
    }
}
