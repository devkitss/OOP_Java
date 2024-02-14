package main.drug;

import java.util.ArrayList;
import java.util.Arrays;

public class PharMetods {
    private ArrayList<Pharmacy> pharmacies = new ArrayList<>();

    public ArrayList<Pharmacy> PharList() {
        Pharmacy p1 = new Pharmacy("Felocil", 12.2);
        Pharmacy p2 = new Pharmacy("Melbimax", 30D);
        Pharmacy p3 = new Pharmacy("Orpage", 8.4);
        Pharmacy p4 = new Pharmacy("Giagant", 44D);

        pharmacies.add(p1);
        pharmacies.add(p2);
        pharmacies.add(p3);
        pharmacies.add(p4);
        return  pharmacies;
    }


    //    public void addPharmacy(Pharmacy ... p) {
//        this.pharmacies.addAll(Arrays.asList(p));
//    }
}
