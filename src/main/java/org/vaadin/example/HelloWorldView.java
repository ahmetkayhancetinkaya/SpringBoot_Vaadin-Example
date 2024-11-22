package org.vaadin.example;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "helloworld", layout = MainLayout.class)
public class HelloWorldView extends Div {
    public HelloWorldView() {
        setText("Hello World!");
    }
}
