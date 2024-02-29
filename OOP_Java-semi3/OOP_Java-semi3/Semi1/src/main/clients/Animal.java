package main.clients;

import java.time.LocalDate;

public class Animal {
//    private String nickName;
//    private Owner owner;
//    private LocalDate birthDate;
//    private Illness illness;

    // protected видно и в классе и во всех наследниках, также еще внутри пакета
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    //Это пустой конструктор (по умолчанию)
    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
//        this.nickName = "Кличка";
//        this.owner = new Owner("Хозяин");
//        this.birthDate = LocalDate.now();
//        this.illness = new Illness("Болеет");

        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void lifeCicle(){
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
        wakeUp();
    }

    private void wakeUp(){
        System.out.println("Животное проснулось!");
//        wakeUp("12:00"); // Это перегрузка!
    }

    private void wakeUp(String time){
        System.out.println("Животное" + nickName + "проснулось в " + time);
    }

    private void hunt(){
        System.out.println("Животное охотится!");
    }

    private void eat(){
        System.out.println("Животное ест!");
    }

    private void sleep(){
        System.out.println("Животное уснуло!");
    }

//    Object

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("nickName = %s, birthDay = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }

}
