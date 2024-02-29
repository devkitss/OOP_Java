package veterinary_clinic.core.personal;

import java.time.LocalDate;

public abstract class Personal {
    public String name;
    public LocalDate birthDate;
    public boolean highEducation;
    public int experience;

    public Personal(String name, LocalDate birthDate, boolean highEducation, int experience) {
        this.name = name;
        this.birthDate = birthDate;
        this.highEducation = highEducation;
        this.experience = experience;
    }

    public Personal() {
    }

    public String getName() {
        return name;
    }

    public abstract void lunch();

    @Override
    public String toString() {
        return String.format("Имя: %s, Дата рождения: %s, Высшее образование: %s, Стаж работы: %s",
                name, birthDate, highEducation, experience);
    }
}
