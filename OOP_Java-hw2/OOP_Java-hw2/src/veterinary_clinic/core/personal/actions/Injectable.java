package veterinary_clinic.core.personal.actions;

public interface Injectable {
    default double vaccine() {
        return 5D;
    }
}
