package problemstatement.hospitalpatient;

// OutPatient.java (Subclass)
import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {
    private List<String> medicalRecords;
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new ArrayList<>();
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    public String viewRecords() {
        return "Medical Records: " + String.join(", ", medicalRecords);
    }
}