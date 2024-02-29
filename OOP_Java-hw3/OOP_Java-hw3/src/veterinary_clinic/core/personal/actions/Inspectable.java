package veterinary_clinic.core.personal.actions;

public interface Inspectable {
    default String inspect() {
        return "Осмотр пациента";
    }
}
