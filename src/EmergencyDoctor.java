public class EmergencyDoctor extends Doctor
        implements MedicalProfessional, Billable {

    public EmergencyDoctor(int personId, String name, int age,
                           String specialization, double consultationFee) {

        super(personId, name, age, specialization, consultationFee);
    }

    public void handleEmergency() {
        System.out.println(getName() + " is handling an emergency.");
    }

    @Override
    public void prescribeMedication() {
        System.out.println(getName() + " is prescribing medication.");
    }

    @Override
    public void generateBill() {
        System.out.println(getName() + " is generating a medical bill.");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is performing emergency doctor duties.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Emergency Doctor");
    }
}