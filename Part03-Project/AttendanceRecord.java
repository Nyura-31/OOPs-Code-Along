public class AttendanceRecord{
    private int studentId;
    private int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status){
        this.studentId = studentId;
        this.courseId = courseId;

        if(status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent")){
            this.status = status;
        }else{
            this.status = "Invalid";
            System.out.println("Warning: Invalid attendance status provided.");
        }
    }

    public int studentId(){
        return studentId;
    }

    public int courseId(){
        return courseId;
    }

    public String status(){
        return status;
    }

    public void displayRecord(){
        System.out.println("StudentID: " + studentId + ", CourseID: " + courseId + ", Status: " + status);
    }
}