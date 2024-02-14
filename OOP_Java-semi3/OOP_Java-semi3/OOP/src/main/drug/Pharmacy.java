package main.drug;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Pharmacy implements Comparable<Pharmacy> {
    private String name;
    private Double power;

    public Pharmacy(String name, Double power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Double.compare(this.power, o.power);
    }

    @Override
    public String toString() {
        return String.format("Pharmacy %s, Power = %s", name, power);
    }
}
