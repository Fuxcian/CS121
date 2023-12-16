package week6.classesAndObjectsPractice;

public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student("John Doe", "12345", "Computer Science", 3.8);
        Student student2 = new Student("Jane Doe", "02468", "Biology", 3.5);
        Student student3 = new Student("Tome Jones", "13579", "Biology", 3.3);

        System.out.printf("Name: %s%n", student1.name);
        System.out.printf("ID: 5s%n", student1.id);
        System.out.printf("Major: %s%n", student1.major);
        System.out.printf("GPA: %s%n", student1.gpa);
        System.out.println();

        student1.getStudentInfo();
    }
}
