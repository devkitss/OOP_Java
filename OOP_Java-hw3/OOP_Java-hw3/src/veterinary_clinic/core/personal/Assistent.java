package veterinary_clinic.core.personal;

import veterinary_clinic.core.personal.actions.Helpable;

import java.time.LocalDate;

public class Assistent extends Personal implements Helpable {
    public Assistent(String name, LocalDate birthDate, boolean highEducation, int experience) {
        super(name, birthDate, highEducation, experience);
    }

    @Override
    public void lunch() {
        System.out.println("Обед начинается с 12:00 до 13:00");
    }

    @Override
    public void help() {
        System.out.println(getName() + " помогает доктору оперировать пациента");
    }
}
