package main.clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); // super означает - сходи в родительский класс и вызови 4 параметра
    }

    public Dog() {
        super();
    }
}
