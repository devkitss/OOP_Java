package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

import java.util.*;

public class DrugMain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);

//        Pharmacy p1 = new Pharmacy();
//        p1.addComponents(water, azitronite);

        PharmacyTwo p1 = new PharmacyTwo();
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);

        PharmacyTwo p3 = new PharmacyTwo();
        p3.addComponents(azitronite, penicillin);

        List<Component> components = new ArrayList<>(); // Shift +F6 - переименование переменной на всех участках кода
        components.add(azitronite);
        components.add(water);
        components.add(penicillin);
        System.out.println(components);

        Collections.sort(components);
//        Collections.sort(components, Comparator.reverseOrder()); // Обратная сортировка
        System.out.println(components);

//        Iterator<Component> iterator = p1; // Используется принцип ООП - полиморфизм,
//        // т.е. наш Pharmacy имеет два обличия: он одновременно Iterator, одновременно и Pharmacy
//
//        while (iterator.hasNext()) { // todo Итератор не поддерживает циклы for и forin (foreach)
//            System.out.println(p1.next().toString());
//        }

//        Iterator<Component> iterator1 = p2;
//
//        while (iterator1.hasNext()) {
//            System.out.println(p2.next().toString());
//        }

//        for (Component c: p2) {
//            System.out.println(c);
//        }
    }
}
