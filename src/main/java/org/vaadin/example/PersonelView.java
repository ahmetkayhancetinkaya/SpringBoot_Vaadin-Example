package org.vaadin.example;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "personel", layout = MainLayout.class)
public class PersonelView extends VerticalLayout {

    private ListDataProvider<Personel> dataProvider;

    @Autowired
    public PersonelView(PersonelService personelService) {
        List<Personel> personelList = personelService.getAllPersonel();
        dataProvider = new ListDataProvider<>(personelList);

        Grid<Personel> grid = new Grid<>(Personel.class);
        grid.setDataProvider(dataProvider);
        
        grid.removeAllColumns();
        grid.addColumn(Personel::getAd).setHeader("Ad");
        grid.addColumn(Personel::getSoyad).setHeader("Soyad");
        grid.addColumn(Personel::getTC).setHeader("TC");

        TextField searchField = new TextField();
        searchField.setPlaceholder("Ara (Ad, Soyad, TC)...");
        searchField.setClearButtonVisible(true); // Temizleme butonu ekle
        searchField.addValueChangeListener(e -> {
            String searchTerm = e.getValue().trim().toLowerCase();
            dataProvider.clearFilters();
            if (!searchTerm.isEmpty()) {
                dataProvider.addFilter(personel -> {
                    boolean matchesAd = personel.getAd().toLowerCase().contains(searchTerm);
                    boolean matchesSoyad = personel.getSoyad().toLowerCase().contains(searchTerm);
                    boolean matchesTC = personel.getTC().toLowerCase().contains(searchTerm);
                    return matchesAd || matchesSoyad || matchesTC;
                });
            }
        });

        add(searchField, grid);
    }
}
