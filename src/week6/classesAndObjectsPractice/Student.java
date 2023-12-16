package week6.classesAndObjectsPractice;

public class Student {

    //variables declared
    String name;
    String id = "12345";
    String major = "Computer Science";
    double gpa = 3.8;

    //constructor
    public Student(String names, String id, String major, double gpa) {
        //variables are assigned the values of each instance of a Student
        this.name = names;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }
   public void getStudentInfo(){
        System.out.printf("Name: %s%nID: %s%nMajor: %s%nGPA: %.1f", name, id, major, gpa);
    }
}
