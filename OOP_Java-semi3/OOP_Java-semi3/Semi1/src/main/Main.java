package main;

//import main.Animal;
import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 05), new Illness("Лишай")); // Создаем экземпляр класса

        System.out.println(cat.getOwner());
        System.out.println(cat.getNickName());

        System.out.println(cat.getNickName());

        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());

        Animal testAnimal = new Animal();
        System.out.println(testAnimal.getNickName());

//        cat.wakeUp();
//        cat.hunt();
//        cat.eat();
//        cat.sleep();
        cat.lifeCicle();

//        Cat catty = new Cat();
        Animal catty = new Cat();
        Dog goodBoy = new Dog();

        System.out.println(goodBoy.getType());
        System.out.println(catty.getType());

        System.out.println(cat.getType());
        System.out.println(cat);

//        catty.meow(); // мяукает только catty
        Cat.meow(); // мяукают все кошки в заведении (todo статик относится к классу!)
        // todo пароли в статике не хранить)

        List<Animal> animals = new ArrayList<>();
        animals.add(catty);
        animals.add(goodBoy);
        animals.add(cat);

        int i = 1;
        for (Animal animal : animals){
            System.out.println(i + ". " + animal);
            i++;
        }
    }
}
