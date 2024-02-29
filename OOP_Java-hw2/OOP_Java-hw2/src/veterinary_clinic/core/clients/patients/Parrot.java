//package veterinary_clinic.core.clients.patients;
//
//import veterinary_clinic.core.clients.patients.actions.Flyable;
//import veterinary_clinic.core.clients.patients.actions.Goable;
//import veterinary_clinic.core.clients.Animal;
//import veterinary_clinic.core.clients.Illness;
//import veterinary_clinic.core.clients.Owner;
//
//import java.time.LocalDate;
//
//public class Parrot extends Animal implements Goable, Flyable {
//    public Parrot(String name, Owner owner, LocalDate birthDate, Illness illness) {
//        super(name, owner, birthDate, illness);
//    }
//
//    @Override
//    public void hunt() {
//        System.out.println(getName() + " не умеет охотиться");
//    }
//
//    @Override
//    public double fly() {
//        return 12D;
//    }
//
//    @Override
//    public Double run() {
//        return 2D;
//    }
//}
