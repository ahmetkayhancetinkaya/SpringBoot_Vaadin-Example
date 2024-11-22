package org.vaadin.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonelService {

    public List<Personel> getAllPersonel() {
        List<Personel> personelList = new ArrayList<>();
        personelList.add(new Personel("12345678901", "Ali", "Veli"));
        personelList.add(new Personel("66598765988", "Ayşe", "Yılmaz"));
        personelList.add(new Personel("25560349877", "Fatma", "Kara"));
        personelList.add(new Personel("22564982216", "Mehmet", "Demir"));
        personelList.add(new Personel("55865911240", "Ahmet", "Çelik"));
        personelList.add(new Personel("65998974522", "Elif", "Ak"));
        personelList.add(new Personel("32165006894", "Merve", "Aydın"));
        personelList.add(new Personel("98765498221", "Deniz", "Kılıç"));
        personelList.add(new Personel("33265114547", "Can", "Güneş"));
        personelList.add(new Personel("25800364599", "Ece", "Yıldız"));

        return personelList;
    }
}
