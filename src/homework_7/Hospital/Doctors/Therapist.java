package homework_7.Hospital.Doctors;

public class Therapist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Терапевт назначает лекарства");
    }
}
