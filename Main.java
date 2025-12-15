package Hospital;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Krishna", 21, "Male");

        try {
            PatientDAO dao = new PatientDAO();
            dao.addPatient(p1);
            System.out.println("Patient added successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
