package org.vaadin.example;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;

public class MainLayout extends AppLayout {

    public MainLayout() {

        Tab aboutTab = new Tab(new RouterLink("About", AboutView.class));
        Tab helloWorldTab = new Tab(new RouterLink("Hello World", HelloWorldView.class));
        Tab personelTab = new Tab(new RouterLink("Personel", PersonelView.class));


        Tabs tabs = new Tabs(aboutTab, helloWorldTab, personelTab);
        tabs.setOrientation(Tabs.Orientation.VERTICAL); 


        addToDrawer(tabs);
    }
}
