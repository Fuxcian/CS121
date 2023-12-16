package week6.encapsulationPractice.accessModifiers.packageDemo;

public class Student {
    //Variables declared
    public String name;
    private String id;
    public String classStanding;
    public String major;
    private double gpa;

    //Constructor
    public Student(String name, String id, String classStanding, String major, double gpa){
        this.name = name;
        this.id = id;
        this.classStanding = classStanding;
        this.major = major;
        this.gpa = gpa;
    }
    /*public visibility means that this method can be accessed anywhere in the program.
     * as long as you have an instance of this class tp call it from.
     */
    public void getStudentInfo(){
        System.out.printf("Name: %s%nID: %s%n", name, id);
    }
    /*protected visibility means that this method can only be accessed inside of this package
     * and from subclasses of this class
     */

    private void getStudentId(){ System.out.printf("Name: %s%nID: %s%n", name, id); }

    protected void getStudentRecord(){
        System.out.printf("Name: %s%nID: %s%n", name, id);
    }
    //default visibility means that this method can only be accessed inside of this package.
    void getStudent(){
        System.out.printf("Name: %s%n", name);
    }
}
