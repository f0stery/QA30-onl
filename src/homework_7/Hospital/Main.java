package homework_7.Hospital;


public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Иван Иванов", new TreatmentPlan(1));
        Patient patient2 = new Patient("Петр Петров", new TreatmentPlan(2));
        Patient patient3 = new Patient("Сидор Сидоров", new TreatmentPlan(3));

        patient1.treat();
        patient2.treat();
        patient3.treat();
    }
}
