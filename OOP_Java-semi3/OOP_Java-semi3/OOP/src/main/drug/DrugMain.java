package main.drug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrugMain {
    public static void main(String[] args) {
        PharMetods method = new PharMetods();
        ArrayList<Pharmacy> x = method.PharList();
        System.out.println(x);
        Collections.sort(x);
        System.out.println(x);
    }
}
