package org.vaadin.example;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "about", layout = MainLayout.class)
public class AboutView extends Div {
    public AboutView() {
        setText("This is the About view");
    }
}
