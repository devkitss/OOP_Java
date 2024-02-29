package veterinary_clinic.core.personal;

import veterinary_clinic.core.clients.Animal;
import veterinary_clinic.core.personal.actions.Inspectable;
import veterinary_clinic.core.personal.actions.Operateable;

import java.time.LocalDate;
import java.util.Map;

public class Doctor extends Assistent implements Operateable, Inspectable {
    private final Map<Integer, String> diagnoses = Map.of(1, "Лишай", 2, "Чумка", 3, "Бешенство");
    private Nurse nurse; // Взаимодействие доктора с его помощником
    double rating;
    public Doctor(String name, LocalDate birthDate, boolean highEducation, int experience, double rating) {
        super(name, birthDate, highEducation, experience);
        this.rating = rating;
    }

    public Doctor() {
        super(null, null, false, 0);
    }

    public String doDiagnose(Animal patient) {
        int key = (int) (1 + Math.random() * 3);
        return patient.name + " подхватил " + diagnoses.get(key);
    }

    @Override
    public void operate() {
        System.out.println(getName() + " оперирует пациента");
    }

    @Override
    public String toString() {
        return super.toString() + " Рейтинг("+rating+")";
    }
}
