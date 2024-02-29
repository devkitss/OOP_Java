package veterinary_clinic.core.clients.patients.actions;

public interface Goable {
    default Double run() {
        return 10D;
    }
}
