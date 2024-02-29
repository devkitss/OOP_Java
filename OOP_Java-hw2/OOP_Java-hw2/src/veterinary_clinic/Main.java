package veterinary_clinic;

import veterinary_clinic.core.VeterinaryClinic;
import veterinary_clinic.core.clients.Animal;
import veterinary_clinic.core.personal.Doctor;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

//        System.out.println(clinic.getPacients());
//        System.out.println(clinic.getPersonal());

        Animal p1 = new Animal("Кузя") {
            @Override
            public void hunt() {
            }
        };
        Doctor doctor = new Doctor();
        clinic.addPersonal(doctor);
        System.out.println((doctor.doDiagnose(p1)));
    }
}