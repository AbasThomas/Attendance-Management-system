package thomas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AttendanceSystem {
    private List<Student> students; // Use ArrayList for initialization

    public AttendanceSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(String id, String name) {
        // TODO: Create Student object and add to students list

    }

    public void markAttendance(String studentId, LocalDate date, AttendanceStatus status) {
        // TODO: Find student by id, then call markAttendance
    }

    public void viewAttendance(String studentId) {
        // TODO: Find student by id, then display attendance records
    }
}
