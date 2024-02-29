package main.clients;

import java.time.LocalDate;

public class Cat extends Animal {
    // todo Напомнить в чем разница в double
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness); //todo Сначала конструктор суперкласса
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

//    public void meow(){
//        System.out.println(this.nickName + "Мяууу!");
//    }

    public static void meow(){
        System.out.println("Мяууу!");
    }

    @Override
    public String toString() {
        return super.toString() + "Discount("+discount+")";
    }
}
