//package veterinary_clinic.core.clients.patients;
//
//import veterinary_clinic.core.clients.patients.actions.Goable;
//import veterinary_clinic.core.clients.patients.actions.Huntable;
//import veterinary_clinic.core.clients.Animal;
//import veterinary_clinic.core.clients.Illness;
//import veterinary_clinic.core.clients.Owner;
//
//import java.time.LocalDate;
//
//public class Cat extends Animal implements Goable, Huntable {
//    public Cat(String name, Owner owner, LocalDate birthDate, Illness illness) {
//        super(name, owner, birthDate, illness);
//    }
//
//    @Override
//    public void hunt() {
//        System.out.println(getName() + " охотится ночью");
//    }
//}
