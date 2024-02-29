package veterinary_clinic.core.personal;

import veterinary_clinic.core.personal.actions.Injectable;
import veterinary_clinic.core.personal.actions.Inspectable;

import java.time.LocalDate;

public class Nurse extends Personal implements Inspectable, Injectable {
    public Nurse(String name, LocalDate birthDate, boolean highEducation, int experience) {
        super(name, birthDate, highEducation, experience);
    }

    @Override
    public void lunch() {
        System.out.println("Обед начинается с 13:00 до 14:00");
    }
}
