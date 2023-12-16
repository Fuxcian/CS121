package week6.encapsulationPractice.accessModifiers;

import week6.encapsulationPractice.accessModifiers.packageDemo.Student;

public class ModifierDemo {
    public static void main(String[] args){
        Student student1 = new Student("John Doe", "12345", "Sophomore", "Computer Science", 3.8);
        System.out.printf("Name: %s%n", student1.name);
        //System.out.printf("ID: %s%n", student1.id);
        System.out.printf("Class Standing: %s%n", student1.classStanding);
        System.out.printf("Major: %s%n", student1.major);
        //System.out.printf("GPA: %s%n", student1.gpa);
        System.out.println();

        student1.getStudentInfo();
        System.out.println();
        //student1.getStudentId();
        //student1.getStudent();
        //student1.getStudentRecord();
    }
}
