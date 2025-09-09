import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Student student1 = new Student("Amara");
        Student student2 = new Student("Arnav");
        Course course1 = new Course("Botany");
        Course course2 = new Course("Mathematics");

        student1.display();
        student2.display();
        course1.display();
        course2.display();

        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        attendanceLog.add(new AttendanceRecord(student1.studentId(), course1.CourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(student2.studentId(), course2.CourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(student1.studentId(), course2.CourseId(), "InvalidStatus"));

        for(AttendanceRecord record: attendanceLog){
            record.displayRecord();
        }
    }
}