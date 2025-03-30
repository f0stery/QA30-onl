package homework_7.Hospital;


import homework_7.Hospital.Doctors.*;


public class Patient {

    private final String name;
    private Doctor doctor;
    private final TreatmentPlan plan;

    public Patient(String name, TreatmentPlan plan) {
        this.name = name;
        this.plan = plan;
    }

    public void assignDoctor() {
        switch (plan.getCode()) {
            case 1: doctor = new Surgeon(); break;
            case 2: doctor = new Dentist(); break;
            default: doctor = new Therapist();
        }
        System.out.println("Пациенту " + name + " назначен " +
                doctor.getClass().getSimpleName());
    }

    public void treat() {
        if (doctor == null) assignDoctor();
        doctor.treat();
    }

}
