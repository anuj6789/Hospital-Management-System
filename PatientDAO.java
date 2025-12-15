package Hospital;

import java.sql.*;

public class PatientDAO {
    public void addPatient(Patient patient) throws SQLException {
        Connection conn = DatabaseConnection.getConnection();
        String query = "INSERT INTO patients (id, name, age, gender) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, patient.getId());
        stmt.setString(2, patient.getName());
        stmt.setInt(3, patient.getAge());
        stmt.setString(4, patient.getGender());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
}
