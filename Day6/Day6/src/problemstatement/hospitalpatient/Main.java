package problemstatement.hospitalpatient;

// Main.java (Demo Class)
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("P001", "Alice", 30, 500.0, 5);
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("Post-operative care");

        OutPatient outPatient = new OutPatient("P002", "Bob", 40, 150.0);
        outPatient.addRecord("Routine check-up");

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: $" + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                System.out.println(medicalRecord.viewRecords());
            }

            System.out.println("-----------------------");
        }
    }
}
