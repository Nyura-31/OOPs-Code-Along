public class Course{
    private static int nextStudentIdCounter = 101;
    private int CourseId;
    private String CourseName;

    public Course(String CourseName){
        this.CourseId = nextStudentIdCounter++;
        this.CourseName = CourseName;
     }

     public void display(){
        System.out.println("CourseID: C" + CourseId + ", CourseName:" + CourseName);
     }
}