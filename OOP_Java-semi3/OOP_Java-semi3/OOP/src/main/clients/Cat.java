package main.clients;

import java.time.LocalDate;

public /*abstract*/ class Cat extends Animal implements Goable, Huntable { // Все абстрактные методы в неабстрактных наследниках должны быть переопределены
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

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышку и кушает");
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
    public void toGo() {
        System.out.print("ходит");
    }

    @Override
    public String toString() {
        return super.toString() + "Discount("+discount+")";
    }
}
