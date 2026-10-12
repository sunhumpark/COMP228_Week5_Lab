public class Surgeon extends Doctor {

    private String surgeryType;
    private String operatingRoom;

    public Surgeon(int personId, String name, int age,
                   String specialization, double consultationFee,
                   String surgeryType, String operatingRoom) {

        super(personId, name, age, specialization, consultationFee);

        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }

    public void performSurgery() {
        System.out.println(getName() + " is performing "
                           + surgeryType + " surgery.");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is performing surgeon duties.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Surgery Type: " + surgeryType);
        System.out.println("Operating Room: " + operatingRoom);
    }
}