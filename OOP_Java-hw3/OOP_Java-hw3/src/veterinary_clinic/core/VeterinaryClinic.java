package veterinary_clinic.core;

import veterinary_clinic.core.clients.Animal;
import veterinary_clinic.core.clients.patients.actions.Goable;
import veterinary_clinic.core.personal.Personal;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Personal> personal;
    private List<Animal> patients;

    public VeterinaryClinic() {
        this.personal = new ArrayList<>(); // Инъекция
        this.patients = new ArrayList<>();
    }

    public List<Personal> getPersonal() {
        return personal;
    }
    public List<Animal> getPacients() {
        return patients;
    }

    public void addPersonal (Personal pers) {
        personal.add(pers);
    }

    public void addPacient (Animal patient) {
        patients.add(patient);
    }

    public List<Animal> getGoables() {
        List<Animal> goList = new ArrayList<>();
        for (Animal a : patients) {
            if (a instanceof Goable) goList.add(a);
        }
        return goList;
    }
}