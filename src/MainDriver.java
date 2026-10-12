public class MainDriver {

    public static void main(String[] args) {

        // 1. Create objects
        Doctor doctor = new Doctor(
                101, "John", 40, "Cardiology", 150.0);

        Nurse nurse = new Nurse(
                102, "Sarah", 30, "Emergency", "Night");

        Surgeon surgeon = new Surgeon(
                103, "Michael", 45, "Surgery", 250.0,
                "Heart", "Room 5");

        EmergencyDoctor emergencyDoctor = new EmergencyDoctor(
                104, "David", 38, "Emergency Medicine", 200.0);

        // 2. Doctor
        System.out.println("===== DOCTOR =====");
        doctor.displayDetails();
        doctor.diagnosePatient();
        doctor.performDuties();

        // 3. Nurse
        System.out.println("\n===== NURSE =====");
        nurse.displayDetails();
        nurse.assistPatient();
        nurse.performDuties();

        // 4. Surgeon
        System.out.println("\n===== SURGEON =====");
        surgeon.displayDetails();
        surgeon.performSurgery();
        surgeon.performDuties();

        // 5. Emergency Doctor
        System.out.println("\n===== EMERGENCY DOCTOR =====");
        emergencyDoctor.displayDetails();
        emergencyDoctor.handleEmergency();
        emergencyDoctor.diagnosePatient();
        emergencyDoctor.performDuties();

        // 6. Interface methods
        System.out.println("\n===== INTERFACES =====");
        emergencyDoctor.prescribeMedication();
        emergencyDoctor.generateBill();

        // 7. Polymorphism
        System.out.println("\n===== POLYMORPHISM =====");

        Person person;

        person = doctor;
        person.performDuties();

        person = nurse;
        person.performDuties();

        person = surgeon;
        person.performDuties();

        person = emergencyDoctor;
        person.performDuties();
    }
}