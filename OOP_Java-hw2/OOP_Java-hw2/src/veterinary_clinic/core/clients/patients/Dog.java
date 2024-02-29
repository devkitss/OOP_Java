//package veterinary_clinic.core.clients.patients;
//
//import veterinary_clinic.core.clients.patients.actions.Goable;
//import veterinary_clinic.core.clients.patients.actions.Huntable;
//import veterinary_clinic.core.clients.patients.actions.Swimable;
//import veterinary_clinic.core.clients.Animal;
//import veterinary_clinic.core.clients.Illness;
//import veterinary_clinic.core.clients.Owner;
//
//import java.time.LocalDate;
//
//public class Dog extends Animal implements Goable, Swimable, Huntable {
//    public Dog(String name, Owner owner, LocalDate birthDate, Illness illness) {
//        super(name, owner, birthDate, illness);
//    }
//
//    @Override
//    public void hunt() {
//        System.out.println(getName() + " охотится днём");
//    }
//
//    @Override
//    public double swim() {
//        return 3D;
//    }
//}
