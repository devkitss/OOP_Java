package main.clients;

import java.time.LocalDate;

public abstract class Animal {
//todo Абстрактный класс - это такой класс который может иметь, а может и не иметь один и более абстрактных методов
// Экземпляр абстрактного класса нельзя создать через ключевое слово new

//    private String nickName; // Поле класса
//    private Owner owner; // Будущий объект (уже объект). Он же в составе другого объекта является полем
//    private LocalDate birthDate; // Поле класса
//    private Illness illness; // Объект

    //todo Все поля класса называют состоянием объекта, а все его методы - это поведения объекта

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

//    public void lifeCicle(){
//        wakeUp("12:00");
//        hunt();
//        eat();
//        sleep();
//        wakeUp();
//    }

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

    public abstract void eat();

    private void sleep(){
        System.out.println("Животное уснуло!");
    }

//    Object

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override // Переопределенный метод
    public String toString() {
        return String.format("nickName = %s, birthDay = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }

}
