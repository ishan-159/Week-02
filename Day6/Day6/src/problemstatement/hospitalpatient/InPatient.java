package problemstatement.hospitalpatient;


// InPatient.java (Subclass)
import java.util.ArrayList;
import java.util.List;

class InPatient extends Patient implements MedicalRecord {
    private List<String> medicalRecords;
    private double dailyRate;
    private int daysAdmitted;

    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new ArrayList<>();
    }

    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    public String viewRecords() {
        return "Medical Records: " + String.join(", ", medicalRecords);
    }
}
