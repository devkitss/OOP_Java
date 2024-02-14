package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); // super означает - сходи в родительский класс и вызови 4 параметра
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест с миски");
    }

    @Override
    public void toGo() {
        System.out.print("ходит");
    }
}
