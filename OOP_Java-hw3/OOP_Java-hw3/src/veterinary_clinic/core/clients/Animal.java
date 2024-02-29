package veterinary_clinic.core.clients;

import java.time.LocalDate;

public abstract class Animal extends Patient {
    public String name;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

//    public Animal(String name, Owner owner, LocalDate birthDate, Illness illness) {
//        this.name = name;
//        this.owner = owner;
//        this.birthDate = birthDate;
//        this.illness = illness;
//    }

    public Animal(String name) {
        this.name = name;
    }

    //    public Animal() {
//        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болезнь"));
//    }

    public String getName() {
        return name;
    }

    public abstract void hunt(); // Не лучшая реализация абстрактного метода, это для примера
    // (необходимо было бы выбрать действие, которое применимо ко всем животным, например есть, спать и т.д.)

    @Override
    public String toString() {
        return String.format("Name: %s, Birth Date: %s, Owner: %s, Illness: %s", name, birthDate, owner, illness);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Animal)) return false;
//        Animal a = (Animal) obj; // операция каста (приведение типов)
//        if (this.id = a.id) return true;
//    }

//    public static void todo() {
//        for (int i = 0; i < animals.size(); i++) {
//            Animal an = animals.get(i);
//            if (an instanceof Cat) ((Cat) an).meow(); //операция каста и операция instanceof дорогостоящие,
//            влияют на производительность, их не должно быть много в коде
//        }
//    }
}

// Интерфейс в программировании == контракт
