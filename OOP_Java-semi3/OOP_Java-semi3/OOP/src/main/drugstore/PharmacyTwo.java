package main.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyTwo implements Iterable<Component> { // todo Iterable уже поддерживает такие циклы как for и forin (foreach) в отличии от Iterator
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
    public Iterator<Component> iterator() { // Интерфейс Iterable как будто обертка над более старым интерфейсом Iterator
        return new Iterator<Component>() { // Анонимный класс (23-33 строки)
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

//    @Override
//    public boolean hasNext() { // Есть ли в нашем лекарстве следующий компонент
//        return index < components.size();
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }
}
