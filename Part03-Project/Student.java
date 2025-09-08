public class Student{
     private static int nextStudentIdCounter = 1;
     private int studentId;
     private String name;

     public Student(String name){
        this.studentId = nextStudentIdCounter++;
        this.name = name;
     }

     public void display(){
        System.out.println("StudentID:" + studentId + ", Name:" + name);
     }
}