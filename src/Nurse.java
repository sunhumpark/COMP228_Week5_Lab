public class Nurse extends Person {

    private String department;
    private String shift;

    public Nurse(int personId, String name, int age,
                 String department, String shift) {

        super(personId, name, age);

        this.department = department;
        this.shift = shift;
    }

    public void assistPatient() {
        System.out.println(getName() + " is assisting a patient.");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is performing nursing duties.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Shift: " + shift);
    }
}