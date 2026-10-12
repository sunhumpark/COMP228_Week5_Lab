
public class Doctor extends Person {

    private String specialization;
    private double consultationFee;

    public Doctor(int personId, String name, int age,
                  String specialization, double consultationFee) {

        super(personId, name, age);

        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public void diagnosePatient() {
        System.out.println(getName() + " is diagnosing a patient.");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is performing doctor duties.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: $" + consultationFee);
    }
}