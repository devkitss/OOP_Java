package main.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private List<Component> components = new ArrayList<>(); // Можно было без аррэйлиста, вызвав конструктор
    private int index; // По умолчанию будет равно 0

//    public Pharmacy(List<Component> components) {
//        this.components = components;
//    }

    public void addComponents(Component ... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

    @Override
    public boolean hasNext() { // Есть ли в нашем лекарстве следующий компонент
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }
}
