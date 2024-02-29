package veterinary_clinic.core.personal;

import veterinary_clinic.core.personal.actions.Injectable;
import veterinary_clinic.core.personal.actions.Inspectable;
import veterinary_clinic.core.personal.actions.Provideable;

import java.time.LocalDate;

public class HeadNurse extends Nurse implements Provideable, Inspectable, Injectable {
    public HeadNurse(String name, LocalDate birthDate, boolean highEducation, int experience) {
        super(name, birthDate, highEducation, experience);
    }

    @Override
    public void provide() {
        System.out.println(getName() + " делает заказ на медикаменты, оформляет документацию, снабжает вет. клинику");
    }
}
