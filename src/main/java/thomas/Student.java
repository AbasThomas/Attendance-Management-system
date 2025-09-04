package thomas;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Student {
    String id;
    String name;

    public Student(String number, String name) {
//        Student student1 = new Student("001", "Name");
        this.id= number;
        this.name = name;
        attendanceRecords = new HashMap<>();
    }
    private Map<LocalDate, AttendanceStatus>attendanceRecords;

    public void markAttendance(LocalDate date, AttendanceStatus status){
        attendanceRecords.put(date, status);
    }
    public  AttendanceStatus getAttendanceForDate(LocalDate date){
        return attendanceRecords.get(date);
    }

//    public static void main(String[] args) {
//        Student s1 = new Student("001", "Thomas");
//        Student s2 = new Student("001", "Thomas");
//
//        s1.markAttendance(LocalDate.of(2025, 9, 3), AttendanceStatus.Present);
//        s2.markAttendance(LocalDate.of(2025, 9, 3), AttendanceStatus.Present);
//
//        System.out.println(s1.getAttendanceForDate(LocalDate.of(2025, 9, 3))); // Present
//        System.out.println(s2.getAttendanceForDate(LocalDate.of(2025, 9, 3))); // null
//
//    }


}
