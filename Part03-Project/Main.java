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
    }
}